/*Exploring conditional statements by simulating a e-wallet txn
* Created by Aashish L. Panigrahi*/
package chp1;

/*Allows to :
* 1. Create a default wallet w/ 0 balance using constructor.
* 2. Add money to the wallet using addMoney method.
* 3. Make transaction to another wallet object using makeTxn method.*/
class CreateWallet{

    //fields of the class
    String accountName;                     //stores account name
    double accountBalance;                  //stores account balance

    //constructor to create default wallet object
    CreateWallet(String accountName){       //Create a default wallet
        if(accountName!=""){                //Account name should not be empty
            this.accountName=accountName;
            this.accountBalance=0;
        }
        else{
            System.out.println("\uD83D\uDE14 Whoops! Name cannot be empty.");
        }
    }

    /*METHOD : addMoneyToWallet(amount)
    * UTILITY: Adds money to the wallet
    * RETURN VALUE :
    *   0 : amount>0 (amt. added to wallet),
    *   1 : amount<=0 (amount not added to wallet*/
    public int addMoneyToWallet(int amount){
        if(amount>0){this.accountBalance+=amount; return 0;}
        else{System.out.printf("\uD83C\uDF89 Yass! ₹%d to wallet\n",amount); return 1;}
    }

    /*METHOD  : makeTxn(walletName, accountBalance)
    * UTILITY : Makes transaction from one account to another
    * RETURN VALUE :
    *   0 : transaction successful
    *   1 : transaction unsuccessful*/
    public int makeTxn(CreateWallet walletName,int txnAmount){
        //Cannot send money to the same wallet
        if(walletName==this){
            System.out.println("\uD83D\uDE14 Whoops! Cannot send money to the same wallet.");
            return 1;
        }
        //When sending money to another wallet
        else{
            //When txn amount of the txn is >= account balance of the wallet
            if(txnAmount<=this.accountBalance){
                this.accountBalance-=txnAmount;         //Deducts money from this wallet
                walletName.addMoneyToWallet(txnAmount); //Adds money to the next wallet
                System.out.println("\uD83C\uDF89 Yass! Transaction succesfull.");
                return 0;
            }
            //When txn amount of the txn is <= 0
            else{
                System.out.println("\uD83D\uDE14 Whoops! You've insufficient balance.");
                return 1;
            }
        }
    }

    /*METHOD  : getWalletDetails()
    * UTILITY : Returning wallet details
    * RETURN VALUE : <STRING>"accountName:amountBalance"*/
    String getWalletDetails(){
       return this.accountName+":"+String.valueOf(this.accountBalance);
    }
}
public class Conditional{
    public static void main(String[] args){

        //Creating a new wallet and checking it's details
        CreateWallet wallet1 = new CreateWallet("aashish");
        CreateWallet wallet2 = new CreateWallet("jeetendra");
        System.out.println(wallet1.getWalletDetails()+"\t"+wallet2.getWalletDetails());

        //Adding money to the created account and checking it's details
        wallet1.addMoneyToWallet(10);
        wallet2.addMoneyToWallet(20);
        System.out.println(wallet1.getWalletDetails()+"\t"+wallet2.getWalletDetails());

        //Sending money from jeetendra's wallet to aashish's wallet
        wallet2.makeTxn(wallet1,5);
        System.out.println(wallet1.getWalletDetails()+"\t"+wallet2.getWalletDetails());
    }
}
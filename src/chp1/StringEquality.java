/*
	Doing string equality with  String.equals
	Created by Aashish Loknath Panigrahi
*/
package chp1;
public class StringEquality{
	public static void main(String args[]){
		String str1 = "Aashish";
		String str3 = "Aashish";
		String str2 = "Panigrahi";
		
		//String equality check with == checks whether two string objects are the same
		if(str1=="Aashish"){
			System.out.printf("%s = %s\n",str1,str3);
		}
		else{
			System.out.printf("%s != %s\n",str1,str3);
		}

		//Checking equality of str1 w/ str2
		if(str1.equals(str2)){
			System.out.printf("%s = %s\n",str1,str2);
		}
		else{
			System.out.printf("%s != %s\n",str1,str2);
		}

		//Checking equality of str1 w/ str1
		if(str1.equals(str1)){
			System.out.printf("%s = %s\n",str1,str1);
		}
		else{
			System.out.printf("\t%s != %s\n",str1,str1);
		}
	}
}
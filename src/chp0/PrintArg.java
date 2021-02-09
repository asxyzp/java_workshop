/*
* Printing the number of command line arguments + command line arguments
* Created by Aashish Loknath Panigrahi*/
package chp0;
public class PrintArg {
    public static void main(String args[]){

        //Printing out the number of arguments
        System.out.println("Number of arguments :\t"+args.length);

        //Printing out the arguments
        String output = "Argument : ";
        for(int i=0;i<args.length;i++){
            output+=args[i]+" ";
        }
        output+="\n";
        System.out.println(output);
    }
}

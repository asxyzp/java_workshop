/*Understanding if-else-else if statements
* CREATED BY Aashish L. Panigrahi*/
package chp1;
import java.util.Scanner;
public class IfElseElseif {
    static int number;
    static boolean tf=true;
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(tf){
            System.out.printf("Enter the number :\t");
            number = scan.nextInt();
            if (number < 0) {
                System.out.println("NUMBER TOO LOW!");
            }
            else if(number==0){
                System.out.println("YASS! YOU GUESSED IT RIGHT");
                tf=false;
            }
            else{
                System.out.println("NUMBER TOO HIGH!");
            }
        }
    }
}

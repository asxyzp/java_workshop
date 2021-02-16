/*
	Using Java 12's enhanced switch
	NOTE : Test in repl.it
	Created by Aashish L. Panigrahi
*/
package chp1;
import java.util.Scanner;
public class EnhancedSwitch{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter some number between 1 to 3 :\t");
		int number = scan.nextInt();
		switch(number){
			case 1 -> System.out.println("ONE");
			case 2 -> System.out.println("TWO");
			case 3 -> System.out.println("THREE");
			default -> System.out.println("NOT BETWEEN 1-3");
		}	
	}
}
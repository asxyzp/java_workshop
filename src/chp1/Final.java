/*
	Understanding final in Java
	Created by Aashish Loknath Panigrahi
*/
package chp1;
public class Final{
	String firstName;
	String lastName;
	Final(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName  = lastName;
	}
	public static void main(String args[]){
		//Declaring a final variable w/o instantiation :
		//Once assigned, cannot be changed
		final int one;
		one = 1;
		//one = 2;		//Cannot be assigned once more

		//Non-transitivity of objects
		final Final final1 = new Final("Aashish","Panigrahi");
		System.out.printf("%s, %s\n", final1.firstName, final1.lastName);
		
		//Changing the state of final object to test non-transitivity
		final1.firstName = "Meghna";
		final1.lastName = "Roy Choudhury";
		System.out.printf("%s, %s\n", final1.firstName, final1.lastName);

		//UNCOMMENT : Will throw error
		//final1 = new Final("Meghna","Roy Choudhury");
	}
}
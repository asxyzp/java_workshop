/*
	Creating a local variable using var
	Created by Aashish Loknath Panigrahi
*/
public class LocalVar{
	public static void main(String args[]){

		//Creating a local variable w/ var
		var val = new String("Hello");
		System.out.println(val);

		//Changing local var variable : NOT POSSIBLE
		val = 1;
		System.out.println(val);
	}
}
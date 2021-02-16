/*
	Converting string to integer/double
	Created by Aashish Loknath Panigrahi
*/
public class StringToNumber{
	public static void main(String[] args){
		int integer = Integer.parseInt("12345");
		double floating = Double.parseDouble("1.2345"); 
		System.out.printf("%d, %f\n", integer, floating);
	}
}
/*
	Checking equality with flooating point number
	Created by Aashish L. Panigrahi
*/

package chp1;
public class DecimalEquality{
	public static void main(String args[]){

		double a = 0.6+0.6+0.6+0.6+0.6+0.6;
		double b = 0.6*6;
		
		System.out.printf("a = %f\n",a);
		System.out.printf("b = %f\n",b);

		//Checking equality of decimal point
		if(a!=b){
			System.out.println("Decimal numbers are not equal");
		}
		else{
			System.out.println("Decimal numbers are equal");
		}

		//Using Math.abs()
		if(Math.abs(a-b)<0.001){
			System.out.println("The numbers are pretty close.");
		}
		else{
			System.out.println("The numbers are not close.");	
		}
	}
}
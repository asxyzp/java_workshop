/*
	Understanding static in Java
	Created by Aashish Loknath Panigrahi
*/

package chp1;
public class Static{

	//Static fields are common to all instances
	//Unlike instance fields which belong to a particular instance
	static String VARIABLE = "stores some value";
	String AnotherVariable;

	//Constructor
	Static(String AnotherVariable){
		this.AnotherVariable = AnotherVariable;
	}

	//Non-static methods can call static variables
	public void legalAccess(){
		VARIABLE+=VARIABLE;			
	}

	//Static methods cannot access non-static variables
	/*public void static illegalAccess(){
		AnotherVariable+=AnotherVariable;
	}*/

	//Static variables can be only accessed by static methods
	public static void main(String args[]){
		Static staticObj = new Static("Some Other Value");
		System.out.println(VARIABLE);
		staticObj.legalAccess();
		//staticObj.illegalAccess();
	}
}
/*
	Understanding access modifiers
	Created by Aashish L. Panigrahi
*/
package chp0.access;
public class Modifier1{

	//Fields
	public String str1;
	private String str2;
	protected String str3;
	//default String str4;

	//Constructor
	Modifier1(String str1,String str2,String str3){
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
	}

	//Getter methods
	public String getStr1(){
		return str1;
	}
	public String getStr2(){
		return str2;
	}
	public String getStr3(){
		return str3;
	}

	//Setter methods
	public void setStr1(){
		this.str1 = str1;
	}
	public void setStr2(){
		this.str2 = str2;
	}
	public void setStr3(){
		this.str3 = str3;
	}

	public static void main(String args[]){
		Modifier1 mod1 = new Modifier1("H","A","L");
		System.out.println(mod1.getStr1());
		System.out.println(mod1.getStr2());
		System.out.println(mod1.getStr3());
	}
}
/*
	Understanding loops in Java
	Created by Aashish Loknath Panigrahi
*/
package chp1;
public class Loops{
	public static void main(String args[]){

		//Understanding for loops
		for(int i=0;i<3;i++){System.out.print("Jimmy\t");}
		System.out.println();
		for(int i=0;i<3;i++){System.out.print("Aaja\t");}
		System.out.println("\n");

		//Understanding modern for lops by iterating through an array
		char[] chars = {'A','B','C','D','E'};
		for(char character : chars){
			System.out.println(character);
		}

		//Breaking out of loop using break 
		String output = "";
		for(int i=0;i<10;i++){
			output+="A";
			if(i==6){
				break;
			}
		}
		System.out.println("\n"+output+"\n");

		//Loop using continue : Pyramid using A
		output = "";
		for(int i=0;i<10;i++){
			output+="A";
			System.out.println(output);
			if(i>6){
				continue;
			}
		}
		System.out.println();

		//An example using both break and continue
		String[] letters = {"A","B","C","D","E","F"};
		for(String letter : letters){
			System.out.println(letter);
			if(letter.equals("A")){
				continue;
			}
			if(letter.equals("C")){
				break;
			}
		}
		System.out.println();

		//Using while loop to print string in string array
		int count = 0;
		output="";
		while(count<letters.length){
			output+=letters[count];
			++count;
		}
		System.out.println(output+"\n");
		System.out.println();

		//Understanding do-while loop
		output="";
		count=0;
		do{
			output+=letters[count];
			++count;
		}while(count<letters.length);
	}
}
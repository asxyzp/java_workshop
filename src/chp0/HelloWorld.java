/*
* Hello, World! program
* Created by Aashish Loknath Panigrahi
* */
package chp0;
import chp0.FuckYou;

//HelloWorld class
class HelloName{
    String name = "";           //Setting default value of constructor
    HelloName(String name){     //Constructor setting value of name
        this.name = name;
    }
    public String printHello(){//print "Hello, <name>"
        return "My name is "+name+".";
    }
}

public class HelloWorld {
    public static void main(String[] args) {

        //Printing Hello, World!
        System.out.println("Hello, World!");

        //Creating HelloName object to print name of the individual
        HelloName aashish0 = new HelloName("Aashish");
        System.out.println(aashish0.printHello());

        //Creating FuckYou object to say fuck you to the individual
        FuckYou aashish1 = new FuckYou("Aashish");
        System.out.println(aashish1.printFuckYou());
    }
}
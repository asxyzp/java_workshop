package chp0;

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
        HelloName aashish = new HelloName("Aashish");
        System.out.println(aashish.printHello());
    }
}

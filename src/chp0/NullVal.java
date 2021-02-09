/*
* Understanding null
* Created by Aashish Loknath Panigrahi
* */
package chp0;

public class NullVal {
    //fields of the class
    int someInteger;
    float someFloatingPointNumber;

    //constructor of the class
    NullVal(int someInteger, float someFloatingPointNumber){
        this.someInteger = someInteger;
        this.someFloatingPointNumber = someFloatingPointNumber;
    }

    //Method to print values of the class
    void printVal(){
        System.out.printf("%i %f",this.someInteger,this.someFloatingPointNumber);
    }

    public static void main(String[] args){
        //Creating an object/reference data type which is not null
        NullVal notNull = new NullVal(0, 0.0f);
        notNull.printVal();

        //Creating an object/reference data type which is null
        NullVal yesNull = null;
        //yesNull.printVal();   //UNCOMMENT : Will throw error because printVal() can be accessed by null reference object

    }
}

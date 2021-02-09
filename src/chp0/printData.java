/*
* Printing different data types in Java
* Created by Aashish Loknath Panigrahi
* */
package chp0;
public class printData {

    public static void main(String args[]){

        //String is a reference data type
        String name = "Aashish";

        //boolean, char, int, long, double, float is a primary data type
        boolean tr = true;
        boolean fa = false;
        char character = '&';
        int integer = 1;
        long longinteger = 1L;
        double dfloating = 0.0;
        float floating = 0.0F;

        System.out.printf("%s, %s",name,name.getClass().getSimpleName());
        System.out.println(character);
        System.out.print(tr);
        System.out.println(fa);
        System.out.println(integer);
        System.out.println(longinteger);
        System.out.println(dfloating);
        System.out.println(floating);
    }
}

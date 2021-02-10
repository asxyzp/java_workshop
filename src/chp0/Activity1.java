/*
* Program for activity 1 : Printing maximum of two doubles
* Created by Aashish L. Panigrahi*/
package chp0;
import java.util.*;
public class Activity1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double a,b,c;
        System.out.print("A?\t");      //Accepting double number 1
        a = scan.nextDouble();
        System.out.print("B?\t");      //Accepting double number 2
        b = scan.nextDouble();
        c = Math.max(a,b);
        System.out.printf("\nMaximum of %f and %f is %f",a,b,c);
    }
}

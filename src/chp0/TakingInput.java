/*
* Understanding how to take command-line input in Java
* Created by Aashish L. Panigrahi*/
package chp0;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args){

        //Using Scanner class to get input
        Scanner scan = new Scanner(System.in);
        System.out.println("a?\t");
        double a = scan.nextDouble();
        System.out.println("b?\t");
        double b = scan.nextDouble();
        double c= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("%f=√%f^2+%f^2",c,a,b);
    }
}

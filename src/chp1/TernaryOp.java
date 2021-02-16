/*Understanding ternary operator
* Created by Aashish L. Panigrahi*/
package chp1;
import java.util.Scanner;
public class TernaryOp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double maxDistance = 10;                    //Maximum distance after which the delivery won't be made
        System.out.printf("Distance?\t");           //Prompt to get distance from user
        double distance =  scan.nextDouble();
        String output = (distance>maxDistance)?"Whoops! Can't deliver this at your place because it's too far.":"Your order has been placed";
        System.out.printf("%s",output);
    }
}

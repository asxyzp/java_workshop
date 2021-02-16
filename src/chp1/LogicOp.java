/*Understanding logic operators
* Created by Aashish L. Panigrahi*/
package chp1;
public class LogicOp {
    public static void main(String[] args){
        boolean t = true;
        boolean f = false;

        //AND : &&
        System.out.printf("%b && %b = %b\n",f,f,f&&f);
        System.out.printf("%b && %b = %b\n",f,t,f&&t);
        System.out.printf("%b && %b = %b\n",t,f,t&&f);
        System.out.printf("%b && %b = %b\n",t,t,t&&t);

        //OR  : ||
        System.out.printf("%b || %b = %b\n",f,f,f||f);
        System.out.printf("%b || %b = %b\n",f,f,f||t);
        System.out.printf("%b || %b = %b\n",f,f,t||f);
        System.out.printf("%b || %b = %b\n",f,f,t||t);

        //NOT : !
        System.out.printf("!%b = %b\n",t,!t);
        System.out.printf("!%b = %b\n",f,!f);
    }
}

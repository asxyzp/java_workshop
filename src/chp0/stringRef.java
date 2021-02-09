/*
* String as a reference data type
* Created by Aashish L. Panigrahi
* */
package chp0;
public class stringRef {
    public static void main(String[] args){

        /*String is a reference data type,
        so when we create another string = this string,
        then the other string will also be able to access this value.*/
        String myName = "Aashish Loknath Panigrahi";
        String referenceToMyName = myName;

        System.out.println(referenceToMyName);
    }
}

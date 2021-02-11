/*Testing whether == works on strings
* CREATED BY Aashish L. Panigrahi*/
package chp1;
public class EqualString {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1=="Hello");
    }
}

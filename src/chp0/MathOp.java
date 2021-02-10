/*
* Trying out basic mathematical functions & operators in Java
* Created by Aashish Loknath Panigrahi*/

package chp0;

//Class for generating random integers b/w 0 & x
class RandomInt{
    public long maxLimit;
    RandomInt(int maxLimit){
        this.maxLimit = maxLimit;
    }
    //Returns random integer b/w 0 & maxLimit
    public long returnRandom(){
        if(maxLimit>0){
            return Math.round(Math.random()*(maxLimit));
        }
        else {
            System.out.println("WHOOPS! Set a +ve maximum limit.");
            return 0;
        }
    }
}

public class MathOp {
    public static void main(String[] args) {

        //Basic mathematical functions
        System.out.printf("ROUND(%.2f)=%d\n",51.49f,Math.round(51.49f));
        System.out.printf("SQRT(%.2f)=%.2f\n",51.49f,Math.sqrt(51.49f));
        System.out.printf("FLOOR(%.2f)=%.2f\n",51.49f,Math.floor(51.49f));
        System.out.printf("CEIL(%.2f)=%.2f\n",51.49f,Math.ceil(51.49f));
        System.out.printf("MAX(%.2f,%.2f)=%.2f\n",51.49f,52.49f,Math.max(51.49f,52.49f));
        System.out.printf("MAX(%.2f,%.2f)=%.2f\n",51.49f,52.49f,Math.min(51.49f,52.49f));

        //Basic Trigonometric function
        System.out.printf("SIN(%.2f rad)=%.2f\n",Math.PI/180f,Math.sin(Math.PI/180f));
        System.out.printf("COS(%.2f rad)=%.2f\n",Math.PI/180f,Math.cos(Math.PI/180f));
        System.out.printf("SINH(%.2f rad)=%.2f\n",Math.PI/180f,Math.sinh(Math.PI/180f));
        System.out.printf("COSH(%.2f rad)=%.2f\n",Math.PI/180f,Math.cosh(Math.PI/180f));
        System.out.printf("TAN(%.2f rad)=%.2f\n",Math.PI/180f,Math.tan(Math.PI/180f));
        System.out.printf("TANH(%.2f rad)=%.2f\n",Math.PI/180f,Math.tanh(Math.PI/180f));

        //Generating a random integer b/w 0 & 1000
        RandomInt random = new RandomInt(1000);
        System.out.printf("Random Integer b/w 0 & 1000 : %d\n",random.returnRandom());

        //Generating a random integer b/w 0 & 10000
        RandomInt random1 = new RandomInt(10000);
        System.out.printf("Random Integer b/w 0 & 1000 : %d\n",random1.returnRandom());

        //Generating a random integer w/ maxLimit<0 & then changing the limit
        RandomInt random2 = new RandomInt(-10000);
        System.out.printf("Random Integer b/w 0 & -10000 : %d\n",random2.returnRandom());
        random2.maxLimit = 100000;
        System.out.printf("Random Integer b/w 0 & -10000 : %d\n",random2.returnRandom());
    }
}

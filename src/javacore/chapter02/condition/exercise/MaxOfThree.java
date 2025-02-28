package javacore.chapter02.condition.exercise;

public class MaxOfThree {

    public static void main(String[] args){

        int a = 10;

        int b = 20;

        int c = 20;

        if(a == b && a == c) {
            System.err.println("Toutes les valeurs sont égales, il n'y a en pas une plus grande que les autres.");
        }
        else if (a == b) {
            System.err.println("Les valeurs de a et b sont égales.");
        }
        else if (a == c) {
            System.err.println("Les valeurs de a et c sont égales.");
        }
        else if (b == c) {
            System.err.println("Les valeurs de b et c sont égales.");
        }
        else {
            if ( a > b && a > c ) {
                System.out.println("Victoire de a  : " + a);
            } else if (b > c) {
                System.out.println("Victoire de b  : " + b);
            } else {
                System.out.println("Victoire de c  : " + c);
            }
        }


    }
}

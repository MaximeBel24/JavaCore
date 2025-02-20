package javacore.chapter01.variable.exercise;

public class FirstOperations {

    public static void main(String[] args){

        System.out.println("N°1 ---------");

        int a = 10;

        int b = 5;

        int sum = a + b;

        int substraction = a -b;

        int multiplication = a * b;

        int division = a / b;

        System.out.println("La somme de " + a + " et " + b + " est " + sum );
        System.out.println("La différence de " + a + " et " + b + " est " + substraction );
        System.out.println("Le produit de " + a + " et " + b + " est " + multiplication );
        System.out.println("Le quotient de " + a + " et " + b + " est " + division );



        System.out.println("N°2 ---------");

        int c = 15;

        int d = 20;

        c += d; // c = c + d;

        System.out.println("c vaut : " + c);

        d -= 5; // d = d - 5;

        System.out.println("d vaut : " + d);

        c *= 3; // c = c * 3;

        System.out.println("c vaut : " + c);

        d /= 3; // d = d / 3;

        System.out.println("d vaut : " + d);



        System.out.println("N°3 ---------");

        int e = 1 * 5 + 2;

        System.out.println("e vaut : " + e);

        int f = 1 * (5 + 2);

        System.out.println("f vaut : " + f);

        int g = ((2 * 5) - 2 / (4 - 2)) - 1;

        System.out.println("g vaut : " + g);
    }
}

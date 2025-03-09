package javacore.chapter03.loop.exercise;

import static java.lang.System.*;

public class PrimeNumberSearcher {

    public static void main(String[] args){

        int count = 1;
        int number = 1;

        System.out.println("Liste des 50 premiers nombres premiers : ");

        while(count <= 50){

            boolean isPrime = true;

            for (int divisor = 2; divisor <= number - 1; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }

    }
}


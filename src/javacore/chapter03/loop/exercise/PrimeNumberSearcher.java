package javacore.chapter03.loop.exercise;

import static java.lang.System.*;

public class PrimeNumberSearcher {

    public static void main(String[] args){

        int primeNumbersFound = 1;
        int potentialPrimeNumber = 1;

        System.out.println("Liste des 50 premiers nombres premiers : ");

        while(primeNumbersFound <= 50){

            boolean isPrime = true;

            for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {
                if (potentialPrimeNumber % potentialDivisor == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.print(potentialPrimeNumber + " ");
                primeNumbersFound++;
            }

            potentialPrimeNumber++;
        }

    }
}


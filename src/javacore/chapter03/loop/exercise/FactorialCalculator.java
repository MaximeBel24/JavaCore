package javacore.chapter03.loop.exercise;

public class FactorialCalculator {

    public static void main(String[] args){

        int currentNumber = 1;

        // Tested Values : 3, 4, 5, 7, 9, 10, 11, 20, 21
        int number = 10;

        long result = 1L;

        if (number < 0 ){
            System.out.println("Erreur : la factorielle d'un nombre négatif est impossible");
        } else if (number == 0) {
            System.out.println("La factorielle de " + number + " est  : " + result);

        }else{
            while (currentNumber <= number){

                result *= currentNumber;
                currentNumber++;
            }

            System.out.println("La factorielle de " + number + " est  : " + result);

        }

    }
}

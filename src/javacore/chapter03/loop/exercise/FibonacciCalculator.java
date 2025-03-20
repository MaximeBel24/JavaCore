package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main(String[] args){

        final int FIRST_TERM = 0;
        final int SECOND_TERM = 1;

        int counter = 0;
        int limit = 1000;

        System.out.println("Les " + limit + " premiers termes de la suite de Fibonacci : ");
        System.out.println(FIRST_TERM);
        System.out.println(SECOND_TERM);

        int currentFirstTerm = FIRST_TERM;
        int currentSecondTerm = SECOND_TERM;
        int result;

        int evenNbCounter = 0;

        while (counter <= limit - 2){ // -2 car les 2 premiers termes sont affichés avant la boucle

            result = currentFirstTerm + currentSecondTerm;

            if (result % 2 == 0){
                System.out.println(result + " (paire) ");
                evenNbCounter++;
            } else {
                System.out.println(result);
            }

            currentFirstTerm = currentSecondTerm;
            currentSecondTerm = result;

            counter++;
        }

        System.out.println("Dans les " + limit + " premiers termes de la suite de Fibonacci, il y a " + evenNbCounter + " termes qui sont paires.");
    }
}

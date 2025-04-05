package javacore.chapter04.function.exercise;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        final int FIRST_TERM = 0;
        final int SECOND_TERM = 1;

        int fibonacciCounter = 0;
        int fibonacciLimit = 1000;
        int evenNbCounter = 0;

        System.out.println("Les " + fibonacciLimit+ " premiers termes de la suite de Fibonacci : ");
        System.out.println(FIRST_TERM);
        System.out.println(SECOND_TERM);
        recursiveDisplayFibonacciSequence(fibonacciLimit, fibonacciCounter, FIRST_TERM, SECOND_TERM, evenNbCounter);

    }

    public static void recursiveDisplayFibonacciSequence(int fibonacciLimit, int fibonacciCounter, int firstTerm, int secondTerm, int evenNbCounter) {

        if (fibonacciCounter > fibonacciLimit - 2){ // -2 car les 2 premiers termes sont affichés avant la boucle
            System.out.println("Dans les " + fibonacciLimit + " premiers termes de la suite de Fibonacci, il y a " + evenNbCounter + " termes qui sont paires.");
            return;
        }

        int result = firstTerm + secondTerm;

        if (result % 2 == 0){
            System.out.println(result + " (paire) ");
            evenNbCounter++;
        } else {
            System.out.println(result);
        }

        firstTerm = secondTerm;
        secondTerm = result;

        fibonacciCounter++;
        recursiveDisplayFibonacciSequence(fibonacciLimit, fibonacciCounter, firstTerm, secondTerm, evenNbCounter);

    }
}

package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main(String[] args){

        int firstNumber = 0;
        int secondNumber = 1;
        int result;

        int counter = 0;
        int limit = 1000;

        int evenNbCounter = 0;

        System.out.println("Les " + limit + " premiers termes de la suite de Fibonacci : ");
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        while (counter <= limit - 2){

            result = firstNumber + secondNumber;

            if (result % 2 == 0){
                System.out.println(result + " (paire)");
                evenNbCounter++;
            } else {
                System.out.println(result);
            }

            firstNumber = secondNumber;
            secondNumber = result;

            counter++;
        }

        System.out.println("Dans les " + limit + " premiers termes de la suite de Fibonacci, il y a " + evenNbCounter + " termes qui sont paires.");
    }
}

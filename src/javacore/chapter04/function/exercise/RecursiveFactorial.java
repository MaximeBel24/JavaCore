package javacore.chapter04.function.exercise;

public class RecursiveFactorial {
    public static void main(String[] args){

        int currentNumber = 1;

        // Tested Values : 3, 4, 5, 7, 9, 10, 11, 20, 21
        int number = 4;

        long result = 1L;

        if (number < 0 ){
            System.out.println("Erreur : la factorielle d'un nombre négatif est impossible");
        } else if (number == 0) {
            System.out.println("La factorielle de " + number + " est  : " + result);

        }else{
            recursiveFactorialCalculator(currentNumber, number, result);
        }
    }

    public static void recursiveFactorialCalculator(int currentNumber, int factorialNumber, long factorialResult){

        if (currentNumber > factorialNumber){
            System.out.println("La factorielle de " + factorialNumber + " est  : " + factorialResult);
            return;
        }
        System.out.println("Étape " + currentNumber + " : " + factorialResult + " × " + currentNumber);
        factorialResult *= currentNumber;
        currentNumber++;
        recursiveFactorialCalculator(currentNumber, factorialNumber, factorialResult);
    }
}

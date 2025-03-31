package javacore.chapter04.function.practice;

public class PracticeFunctionReturn {

    public static void main(String[] args){

        // return; // Stop the main execution (like a break in a loop)

        int number1 = 2;
        int number2 = 5;

        int result1 = sum(number1, number2);
        System.out.println("Résultat de " + number1 + " + " + number2 + " = " + result1);

        int result2 = sum(10, 10);
        System.out.println("Résultat de 10 + 10 = " + result2);

        int result3 = sum(25, 25);
        System.out.println("Résultat de 25 + 25 = " + result3);

        System.out.println(sum(100, 100));

    }

    public static int sum(int number1, int number2) {

//        return 1; // Generating a "Unreachable Statement"

        int result = number1 + number2;

        return result;

        // return number1 + number2;

    }
}

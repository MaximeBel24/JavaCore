package javacore.chapter04.function.exercise;

public class VariablesPermutation {
    public static void main(String[] args){

        System.out.println("Résultat de sum avec 2 arguments : " + sum(20, 5));

        System.out.println("Résultat de sum avec 3 arguments : " + sum(20, 5, 12));
    }

    public static int sum(int number1, int number2){
        return number1 + number2;
    }

    public static int sum(int number1, int number2, int number3){
        return sum(sum(number1, number2), number3);
    }
}

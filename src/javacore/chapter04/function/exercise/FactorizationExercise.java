package javacore.chapter04.function.exercise;

public class FactorizationExercise {


    public static void main(String[] args) {

        // Afficher les nombres de 1 à 5
        displayNumbersInRange(1, 5);

        // Afficher la table de multiplication de 2
        displayMultiplicationTableOf(2);

        // Afficher la table de multiplication de 3
        displayMultiplicationTableOf(3);

        // Afficher la table de multiplication de 6
        displayMultiplicationTableOf(6);

        // Afficher les carrés des nombres de 1 à 5
        displaySquaresInRange(1, 5);


        // Afficher les carrés des nombres de 6 à 10
        displaySquaresInRange(6, 10);

    }

    public static void displayNumbersInRange(int minValue, int maxValue){
        for (int number = minValue; number <= maxValue; number++) {
            System.out.println("Nombre: " + number);
        }
    }

    public static void displayMultiplicationTableOf(int factor){
        System.out.println("Table de multiplication de " + factor + " :");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(factor + " x " + multiplier + " = " + (factor * multiplier));
        }
    }

    public static void displaySquaresInRange(int minValue, int maxValue){
        System.out.println("Carrés des nombres de " + minValue + " à " + maxValue + " :");
        for (int currentNumber = minValue; currentNumber <= maxValue; currentNumber++) {
            System.out.println(currentNumber + " au carré = " + (currentNumber * currentNumber));
        }
    }
}

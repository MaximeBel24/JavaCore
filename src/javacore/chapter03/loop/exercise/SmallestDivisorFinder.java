package javacore.chapter03.loop.exercise;

public class SmallestDivisorFinder {

    public static void main(String[] args){

        // Tested Values: 7, 9, 15, 20, 21, 25
        int number = 23;

        int divisor = 2;

        while (number % divisor != 0){
            divisor++;
        }

        String result = "\"Le plus petit diviseur de " + number + " est " + divisor + ".";

        if (number == divisor){
            System.out.println(result + " Il s'agit donc d'un nombre premier.");
        } else {
            System.out.println(result);
        }
    }
}

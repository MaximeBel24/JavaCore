package javacore.chapter02.condition.exercise;

public class ParityChecker {

    public static void main(String[] args) {

        int number = 333377778;

        if ( number % 2 == 0 ){
            System.out.println(number + " est un nombre pair.");
        } else  {
            System.out.println(number + " est un nombre impair.");
        }
    }
}

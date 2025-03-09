package javacore.chapter03.loop.exercise;

public class MultiplicationTables {

    public static void main(String[] args){
        int limit = 9;

        for (int number = 1 ; number <= limit; number++ ){

            System.out.print("Table de " + number + " : ");

            for (int factor = 1; factor <= 10; factor++ ){

                int product = number * factor;
                System.out.print( product + " ");

            }

            System.out.println(" ");
        }
    }

}

package javacore.chapter03.loop.exercise;

public class FullPyramid {

    public static void main(String[] args){
        int numberOfRows = 15;

        for (int line = 1; line <= numberOfRows; line++) {
            System.out.println(" ");

            for (int space = numberOfRows; space >= line; space-- ){
                System.out.print(" ");

            }
            for (int star = 1; star <= line * 2 - 1 ; star++ ){
                    System.out.print("*");
            }
        }

    }
}
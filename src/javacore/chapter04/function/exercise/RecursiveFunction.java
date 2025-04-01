package javacore.chapter04.function.exercise;

public class RecursiveFunction {

    public static void main(String[] args){
        int counter = 1;
        displayNumberTo(10000, counter);
    }

    public static void displayNumberTo(int numberLimit,int numberCounter) {
        System.out.println(numberCounter);
        numberCounter++;
        if (numberCounter <= numberLimit){
             displayNumberTo(numberLimit, numberCounter);
        }
    }
}

package javacore.chapter04.function.exercise;

public class RecursiveFunction {

    public static void main(String[] args){
        int counter = 1;
        recursiveDisplayNumberTo(10000, counter);
    }

    public static void recursiveDisplayNumberTo(int numberLimit,int numberCounter) {
        if (numberCounter > numberLimit){
            return;
        }
        System.out.println(numberCounter);
        numberCounter++;
        recursiveDisplayNumberTo(numberLimit, numberCounter);
    }
}

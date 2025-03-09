package javacore.chapter03.loop.exercise;

public class WhileLoopExample {

    public static void main(String[] args){

        int loopCounter = 1;
        int maxCounter = 1000;
        int index = 1;

        while (loopCounter <= maxCounter){
            System.out.println(index + "- Hello World");
            loopCounter++;
            index++;
        }
    }
}

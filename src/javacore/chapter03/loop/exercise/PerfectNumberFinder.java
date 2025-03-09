package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {

    public static void main(String[] args){

        int end = 100000;

        for (int start = 1; start <= end ; start++){

            int result = 0;

            for (int divisor = 1; divisor < start; divisor++ ){
                int moduloVerifier = start % divisor;
                if (moduloVerifier == 0){
                    result += divisor;
                }
            }
            if(result == start){
                System.out.println(start + " est un nombre parfait");
            }
        }

    }
}

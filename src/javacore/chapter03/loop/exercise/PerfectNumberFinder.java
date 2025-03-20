package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {

    public static void main(String[] args){

        int max = 100000;

        for (int potentialPerfectNumber = 1; potentialPerfectNumber <= max ; potentialPerfectNumber++){

            int sumOfDivisors = 0;

            for (int potentialDivisor = 1; potentialDivisor < potentialPerfectNumber; potentialDivisor++ ){
                if (potentialPerfectNumber % potentialDivisor == 0){
                    sumOfDivisors += potentialDivisor;
                }
            }
            if(sumOfDivisors == potentialPerfectNumber){
                System.out.println(potentialPerfectNumber + " est un nombre parfait");
            }
        }

    }
}

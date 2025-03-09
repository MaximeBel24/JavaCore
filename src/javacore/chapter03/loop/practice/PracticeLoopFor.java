package javacore.chapter03.loop.practice;

public class PracticeLoopFor {

    public static void main(String[] args){
        int result = 0;

        int currentNumber = 1;
        int maxNumber = 100;


        while (currentNumber <= maxNumber) {

            System.out.println("Result  = " + result + " + " + currentNumber);
            result += currentNumber; // result = result + currentNumber
            System.out.println("------> " + result);

            currentNumber++;
        }

        System.out.println("Somme des nombres de 1 à " + maxNumber + " : " + result);

        int resultFor = 0;

        for (int cNumber = 1; cNumber <= maxNumber; cNumber++){
            System.out.println("Result  = " + resultFor + " + " + cNumber);
            resultFor += cNumber; // result = result + currentNumber
            System.out.println("------> " + resultFor);
        }

        System.out.println("Somme des nombres de 1 à " + maxNumber + " : " + resultFor);



        for (int a = 1 ; a <= 100 ; a++){

            if (a % 2 == 0){

                int resultForIf = 0;

                for (int b = 1 ; b <= a ; b++){
                    resultForIf += b;
                }

                System.out.println("Somme des nombres entre 1 et " + a + " : " + resultForIf);
            }
            else {
                System.out.println("Le nombre suivant est impair : " + a);
            }
        }

    }
}

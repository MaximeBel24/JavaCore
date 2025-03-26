package javacore.chapter03.loop.exercise;

public class ArmstrongNumbers {

    public static void main(String[] args){

        int armstrongNumberCount = 1;

        for (int potentialArmstrongNumber = 1; armstrongNumberCount <= 10; potentialArmstrongNumber++){

            int saveNumber = potentialArmstrongNumber;
            int digitCounter;

            // Détermine le nombre de chiffre de number
            for (digitCounter = 0; saveNumber > 0; digitCounter++){
                saveNumber /= 10;
            }

            saveNumber = potentialArmstrongNumber;
            int result = 0;

            // Calcule chaque chiffre de number par la puissance de son nombre chiffre
            for (int divisor = 10; saveNumber > 0 ; saveNumber /= divisor){

                int digitRaisedToThePower = saveNumber % 10;
                int saveDigitRaisedToThePower = digitRaisedToThePower;

                for (int powerIndex = 1; powerIndex < digitCounter; powerIndex++ ){

                    digitRaisedToThePower *= saveDigitRaisedToThePower;

                }

                result += digitRaisedToThePower;
            }

            // Compare si le résultat des sommes des puissances est bien égale au nombre de base
            if (result == potentialArmstrongNumber && !(potentialArmstrongNumber < 10)){
                System.out.println(potentialArmstrongNumber + " est le " + armstrongNumberCount + (armstrongNumberCount > 1 ? "em" : "er") + " nombre Armstrong");
                armstrongNumberCount++;
            }
        }

    }
}

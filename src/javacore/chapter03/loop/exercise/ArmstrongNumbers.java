package javacore.chapter03.loop.exercise;

public class ArmstrongNumbers {

    public static void main(String[] args){

        int armstrongNumberCount = 1;

        for (int number = 1; armstrongNumberCount <= 10; number++){

            int saveNumber = number;
            int count;

            // Détermine le nombre de chiffre de number
            for (count = 0; saveNumber > 0; count++){
                saveNumber /= 10;
            }

//            System.out.println("Il y a " + count + " chiffres dans " + number);

            saveNumber = number;
            int result = 0;

            // Calcule chaque chiffre de number par la puissance de son nombre chiffre
            for (int divisor = 10; saveNumber > 0 ; saveNumber /= divisor){
                int digitRaisedToThePower = saveNumber % 10;
                int saveDigitRaisedToThePower = digitRaisedToThePower;
//                System.out.println(digitRaisedToThePower + " est le chiffre à calculé");
                for (int powerCount = 1; powerCount < count; powerCount++ ){
//                    System.out.println("Tour "+ powerCount + ", Avant : " + digitRaisedToThePower);
                    digitRaisedToThePower *= saveDigitRaisedToThePower;
//                    System.out.println("Tour "+ powerCount + ", Après : " + digitRaisedToThePower);
                }

                result += digitRaisedToThePower;
            }

            // Compare si le résultat des sommes des puissances est bien égale au nombre de base
            if (result == number && !(number < 10)){
                System.out.println(number + " est le " + armstrongNumberCount + (armstrongNumberCount > 1 ? "em" : "er") + " nombre Armstrong");
                armstrongNumberCount++;
            }
        }

    }
}

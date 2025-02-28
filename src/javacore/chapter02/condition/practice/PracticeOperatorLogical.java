package javacore.chapter02.condition.practice;

public class PracticeOperatorLogical {

    public static void main(String[] args){

        boolean trueAndTrue   = true && true;   // true
        boolean trueAndFalse  = true && false;  // false
        boolean falseAndTrue  = false && true;  // false
        boolean falseAndFalse = false && false; // false

        boolean trueOrTrue   = true || true;   // true
        boolean trueOrFalse  = true || false;  // true
        boolean falseOrTrue  = false || true;  // true
        boolean falseOrFalse = false || false; // false

        boolean notTrue  = !true;  // false
        boolean notFalse = !false; // true

        boolean trueAndTrueAndTrue  = true && true && true;  // true
        boolean trueAndTrueAndFalse = true && true && false; // false

        boolean trueOrTrueOrTrue =  true || true || true;  // true
        boolean trueOrTrueOrFalse = true || true || false; // true

        boolean notNotTrue  = !!true;  // true
        boolean notNotFalse = !!false; // false




        boolean isLoggedIn = true; // L'utilisateur est-il connecté ?

        int age = 25; // Age de l'utilisateur

        int seatsAvailable = 0; // Nombres de places disponibles dans l'avion

        boolean isPremiumMember = true; // Est-ce que l'utilisateur est un membre VIP

        boolean isVipFlight = true; // Est-ce que le vol est réservé aux VIP

        if( isLoggedIn && age >= 18 && seatsAvailable > 0 && (!isVipFlight || isPremiumMember)) {

            System.out.println("Réservation effectué avec succès !");
            seatsAvailable--;

        }
        else {

            System.out.println("Réservation impossible, essayez plus tard.");

        }

        // Ternaire

        double initialPrice = 500;
        double finalPrice;

        int discount = 20;

        double discountAmount = discount > 0 ? initialPrice * discount / 100 : 0;

        finalPrice = initialPrice - discountAmount;

        System.out.println("Prix : " + finalPrice + "€");

    }
}

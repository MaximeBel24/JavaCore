package javacore.chapter02.condition.exercise;

public class FlightReservationValidator {

    public static void  main(String[] args){

        // Tested Values : true / false
        boolean isLoggedIn = true;

        // Tested Values : 15, 25
        int age = 18;

        // Tested Values : 0 / 20
        int seatsAvailable = 3;

        // Tested Values : true / false
        boolean isPremiumMember = true;

        // Tested Values : true / false
        boolean isVipFlight = true;

        if( isLoggedIn && age >= 18 && seatsAvailable > 0 ) {

            if( isPremiumMember && isVipFlight ){
                System.out.println("Réservation VIP effectué avec succès !");
                seatsAvailable--;
            } else if (!isVipFlight) {
                System.out.println("Réservation effectué avec succès !");
            } else {
                System.out.println("Réservation impossible, vous ne pas réservez ce vol sans être membre premium");
            }

        }
        else {

            if(!isLoggedIn){
                System.out.println("Réservation impossible, vous n'êtes pas connecter.");
            }

            if(age < 18){
                System.out.println("Réservation impossible, vous n'avez pas l'âge requit pour réserver un billet.");
            }

            if(seatsAvailable <= 0){
                System.out.println("Réservation impossible, il n'y a plus de billet disponible pour ce vol.");
            }

            if(isVipFlight && !isPremiumMember) {
                System.out.println("Réservation impossible, vous ne pas réservez ce vol sans être membre premium");
            }

        }
    }
}

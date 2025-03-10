package javacore.chapter02.condition.exercise;

public class ObfuscatedCodeV1 {

    public static void main(String[] args) {

        int typeOfVehicle = 3; // Type de véhicule (1 = Electrique, 2 = Hybride, 3 = Thermique)

        double price = 100;

        boolean isClean = false;
        double ecologicalBonus = 0.03;

        double environmentalTax = 0;

        if (typeOfVehicle == 1) {
            environmentalTax = price * 0.10; // Montant de taxe pour véhicule électrique
        }
        if (typeOfVehicle == 2) {
            environmentalTax = price * 0.20; // Montant de taxe pour véhicule hybride
        }
        if (typeOfVehicle == 3) {
            environmentalTax = price * 0.35; // Montant de taxe pour véhicule thermique
        }
        if (isClean) {
            environmentalTax -= (price * ecologicalBonus); // Application d'un bonus écologique si le véhicule est propre
        }

        System.out.println("Montant de la taxe environnemental : " + environmentalTax + "€");

    }
}

package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {

    public static void main(String[] args){

        int totalBill = 70;

        int amountPaid = 130;

        int difference = amountPaid - totalBill;

        if (totalBill > amountPaid){
            System.out.println("Vous n'avez pas payé le montant total.");
        } else {
            System.out.println("Monnaie rendue : ");

            int unitValue = 50;
            while (difference > 0) {
                int nbUnits = difference / unitValue;

                if (nbUnits > 0) {
                    System.out.println(nbUnits + " " + (unitValue >= 2 ? "billet" : "pièce") + (nbUnits > 1 ? "s" : "") + " de " + unitValue + "€ ");
                    difference -= nbUnits * unitValue;
                }

                if (unitValue == 50) unitValue = 20;
                else if (unitValue == 20) unitValue = 10;
                else if (unitValue == 10) unitValue = 2;
                else if (unitValue == 2) unitValue = 1;
                else break;
            }

        }
    }
}

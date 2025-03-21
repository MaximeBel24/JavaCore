package javacore.chapter02.condition.exercise;

public class CoinChangerV1 {

    public static void main(String[] args){

        int totalBill = 70;

        int amountPaid = 130;

        int difference = amountPaid - totalBill;

        if (totalBill > amountPaid){
            System.out.println("Vous n'avez pas payé le montant total.");
        } else {
            System.out.print("Monnaie rendu : ");

            int nbBanknote;

            if (difference >= 50){
                nbBanknote =  difference / 50;
                System.out.print(nbBanknote + " billet" + (nbBanknote > 1 ? "s" : "") + " de 50€ ");
                difference -= nbBanknote * 50;
            }
            if (difference >= 20){
                nbBanknote =  difference / 20;
                System.out.print(nbBanknote + " billet" + (nbBanknote > 1 ? "s" : "") + " de 20€ ");
                difference -= nbBanknote * 20;
            }
            if (difference >= 10){
                nbBanknote =  difference / 10;
                System.out.print(nbBanknote + " billet" + (nbBanknote > 1 ? "s" : "") + " de 10€ ");
                difference -= nbBanknote * 10;
            }
            if (difference >= 2){
                nbBanknote =  difference / 2;
                System.out.print(nbBanknote + " pièce" + (nbBanknote > 1 ? "s" : "") + " de 2€ ");
                difference -= nbBanknote * 2;
            }
            if (difference == 1){
                System.out.print("1 pièce de 1€");
                difference -= 1;
            }
        }
    }
}

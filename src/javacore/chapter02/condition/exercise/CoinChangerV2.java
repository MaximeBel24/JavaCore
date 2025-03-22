package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {

    public static void main(String[] args){

        int numberOf50Banknotes = 3;
        int numberOf20Banknotes = 10;
        int numberOf10Banknotes = 4;
        int numberOf2Coins = 6;
        int numberOf1Coins = 20;

        // Calcul du montant maximal du distributeur
        int totalDistributorAmount = 50 * numberOf50Banknotes + 20 * numberOf20Banknotes + 10 * numberOf10Banknotes + 2 * numberOf2Coins + numberOf1Coins;

//        System.out.println("Total des liquidité du distributeur : " + totalDistributorAmount + "€");

        int totalBill = 70;

        int amountPaid = 437;

        int difference = amountPaid - totalBill;

        if (totalBill > amountPaid){
            difference *= -1;
            System.out.println("Vous n'avez pas payé le montant total. Il manque " + difference + "€");

        } else if (difference > totalDistributorAmount) {
            int missingMoney = difference -totalDistributorAmount;
            System.out.println("Le distributeur ne possède pas assez de stock pour rendre la monnaie. Il manque " + missingMoney + "€.");

        } else {
            System.out.println("Monnaie rendu : ");

            int nbBanknote;

            if (difference >= 50 && numberOf50Banknotes > 0){
                nbBanknote =  difference / 50;
                if (nbBanknote <= numberOf50Banknotes){
                    System.out.println("- " + nbBanknote + " billet" + (nbBanknote > 1 ? "s" : "") + " de 50€ ");
                    difference -= nbBanknote * 50;
                    numberOf50Banknotes -= nbBanknote;
                } else {
                    System.out.println("- " + numberOf50Banknotes + " billet" + (numberOf50Banknotes > 1 ? "s" : "") + " de 50€ ");
                    difference -= numberOf50Banknotes * 50;
                    numberOf50Banknotes -= numberOf50Banknotes;
                }
            }
            if (difference >= 20 && numberOf20Banknotes > 0){
                nbBanknote =  difference / 20;
                if (nbBanknote <= numberOf20Banknotes){
                    System.out.println("- " + nbBanknote + " billet" + (nbBanknote > 1 ? "s" : "") + " de 20€ ");
                    difference -= nbBanknote * 20;
                    numberOf20Banknotes -= nbBanknote;
                } else {
                    System.out.println("- " + numberOf20Banknotes + " billet" + (numberOf20Banknotes > 1 ? "s" : "") + " de 20€ ");
                    difference -= numberOf20Banknotes * 20;
                    numberOf20Banknotes -= numberOf20Banknotes;
                }
            }
            if (difference >= 10 && numberOf10Banknotes > 0){
                nbBanknote =  difference / 10;
                if (nbBanknote <= numberOf10Banknotes){
                    System.out.println("- " + nbBanknote + " billet" + (nbBanknote > 1 ? "s" : "") + " de 10€ ");
                    difference -= nbBanknote * 10;
                    numberOf10Banknotes -= nbBanknote;
                } else {
                    System.out.println("- " + numberOf10Banknotes + " billet" + (numberOf10Banknotes > 1 ? "s" : "") + " de 10€ ");
                    difference -= numberOf10Banknotes * 10;
                    numberOf10Banknotes -= numberOf10Banknotes;
                }
            }
            if (difference >= 2 && numberOf2Coins > 0){
                nbBanknote =  difference / 2;
                if (nbBanknote <= numberOf2Coins){
                    System.out.println("- " + nbBanknote + " pièce" + (nbBanknote > 1 ? "s" : "") + " de 2€ ");
                    difference -= nbBanknote * 2;
                    numberOf2Coins -= nbBanknote;
                } else {
                    System.out.println("- " + numberOf2Coins + " pièce" + (numberOf2Coins > 1 ? "s" : "") + " de 2€ ");
                    difference -= numberOf2Coins * 2;
                    numberOf2Coins -= numberOf2Coins;
                }
            }
            if (difference >= 1 && numberOf1Coins > 0){
                nbBanknote =  difference / 1;
                if (nbBanknote <= numberOf1Coins){
                    System.out.println("- " + nbBanknote + " pièce" + (nbBanknote > 1 ? "s" : "") + " de 1€ ");
                    difference -= nbBanknote * 1;
                    numberOf1Coins -= nbBanknote;
                } else {
                    System.out.println("- " + numberOf1Coins + " pièce" + (numberOf1Coins > 1 ? "s" : "") + " de 1€ ");
                    difference -= numberOf1Coins * 1;
                    numberOf1Coins -= numberOf1Coins;
                }
            }

//            System.out.println("Dans la machine il reste :");
//            System.out.println("- " +numberOf50Banknotes + " billets de 50€");
//            System.out.println("- " +numberOf20Banknotes + " billets de 20€");
//            System.out.println("- " +numberOf10Banknotes + " billets de 10€");
//            System.out.println("- " +numberOf2Coins + " pièces de 2€");
//            System.out.println("- " +numberOf1Coins + " pièces de 1€");
        }
    }
}

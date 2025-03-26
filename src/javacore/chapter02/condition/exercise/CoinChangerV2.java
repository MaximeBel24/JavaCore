package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {

    public static void main(String[] args){

        final int FIFTY_BANKNOTE_VALUE = 50;
        final int TWENTY_BANKNOTE_VALUE = 20;
        final int TEN_BANKNOTE_VALUE = 10;
        final int TWO_COIN_VALUE = 2;
        final int ONE_COIN_VALUE = 1;

        int availableAmountOf50Banknotes = 3;
        int availableAmountOf20Banknotes = 10;
        int availableAmountOf10Banknotes = 4;
        int availableAmountOf2Coins = 6;
        int availableAmountOf1Coins = 20;

        // Calcul du montant maximal du distributeur
        int totalDistributorAmount =
                FIFTY_BANKNOTE_VALUE * availableAmountOf50Banknotes +
                TWENTY_BANKNOTE_VALUE * availableAmountOf20Banknotes +
                TEN_BANKNOTE_VALUE * availableAmountOf10Banknotes +
                TWO_COIN_VALUE * availableAmountOf2Coins +
                availableAmountOf1Coins;

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

            int requiredBanknote;

            if (difference >= FIFTY_BANKNOTE_VALUE && availableAmountOf50Banknotes > 0) {
                requiredBanknote = difference / FIFTY_BANKNOTE_VALUE;
                if (requiredBanknote > availableAmountOf50Banknotes) {
                    requiredBanknote = availableAmountOf50Banknotes;
                }
                System.out.println("- " + requiredBanknote + " billet" + (requiredBanknote > 1 ? "s" : "") + " de 50€ ");
                difference -= requiredBanknote * FIFTY_BANKNOTE_VALUE;
                availableAmountOf50Banknotes -= requiredBanknote;
            }

            if (difference >= TWENTY_BANKNOTE_VALUE && availableAmountOf20Banknotes > 0) {
                requiredBanknote = difference / TWENTY_BANKNOTE_VALUE;
                if (requiredBanknote > availableAmountOf20Banknotes) {
                    requiredBanknote = availableAmountOf20Banknotes;
                }
                System.out.println("- " + requiredBanknote + " billet" + (requiredBanknote > 1 ? "s" : "") + " de 20€ ");
                difference -= requiredBanknote * TWENTY_BANKNOTE_VALUE;
                availableAmountOf20Banknotes -= requiredBanknote;
            }

            if (difference >= TEN_BANKNOTE_VALUE && availableAmountOf10Banknotes > 0) {
                requiredBanknote = difference / TEN_BANKNOTE_VALUE;
                if (requiredBanknote > availableAmountOf10Banknotes) {
                    requiredBanknote = availableAmountOf10Banknotes;
                }
                System.out.println("- " + requiredBanknote + " billet" + (requiredBanknote > 1 ? "s" : "") + " de 10€ ");
                difference -= requiredBanknote * TEN_BANKNOTE_VALUE;
                availableAmountOf10Banknotes -= requiredBanknote;
            }

            if (difference >= TWO_COIN_VALUE && availableAmountOf2Coins > 0) {
                requiredBanknote = difference / TWO_COIN_VALUE;
                if (requiredBanknote > availableAmountOf2Coins) {
                    requiredBanknote = availableAmountOf2Coins;
                }
                System.out.println("- " + requiredBanknote + " pièce" + (requiredBanknote > 1 ? "s" : "") + " de 2€ ");
                difference -= requiredBanknote * TWO_COIN_VALUE;
                availableAmountOf2Coins -= requiredBanknote;
            }

            if (difference >= ONE_COIN_VALUE && availableAmountOf1Coins > 0) {
                requiredBanknote = difference / ONE_COIN_VALUE;
                if (requiredBanknote > availableAmountOf1Coins) {
                    requiredBanknote = availableAmountOf1Coins;
                }
                System.out.println("- " + requiredBanknote + " pièce" + (requiredBanknote > 1 ? "s" : "") + " de 1€ ");
                difference -= requiredBanknote * ONE_COIN_VALUE;
                availableAmountOf1Coins -= requiredBanknote;
            }

//            System.out.println("Dans la machine il reste :");
//            System.out.println("- " +availableAmountOf50Banknotes + " billets de 50€");
//            System.out.println("- " +availableAmountOf20Banknotes + " billets de 20€");
//            System.out.println("- " +availableAmountOf10Banknotes + " billets de 10€");
//            System.out.println("- " +availableAmountOf2Coins + " pièces de 2€");
//            System.out.println("- " +availableAmountOf1Coins + " pièces de 1€");
        }
    }
}

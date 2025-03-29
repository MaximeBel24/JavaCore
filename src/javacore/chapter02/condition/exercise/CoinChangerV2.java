package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {

    public static void main(String[] args) {

        final int VALUE_BANKNOTE_FIFTY = 50;
        final int VALUE_BANKNOTE_TWENTY = 20;
        final int VALUE_BANKNOTE_TEN = 10;
        final int VALUE_COIN_TWO = 2;
        final int VALUE_COIN_ONE = 1;

        int availableBanknotes50 = 1;
        int availableBanknotes20 = 0;
        int availableBanknotes10 = 0;
        int availableCoins2 = 0;
        int availableCoins1 = 0;

        // Calcul du montant maximal du distributeur
        int availableTotalAmount =
                VALUE_BANKNOTE_FIFTY * availableBanknotes50 +
                VALUE_BANKNOTE_TWENTY * availableBanknotes20 +
                VALUE_BANKNOTE_TEN * availableBanknotes10 +
                VALUE_COIN_TWO * availableCoins2 +
                VALUE_COIN_ONE * availableCoins1;

        int totalBill = 70;
        int amountPaid = 110;
        int difference = amountPaid - totalBill;
        System.out.println("À rendre : " + difference + "€");

        if (totalBill > amountPaid) {
            difference *= -1;
            System.out.println("Vous n'avez pas payé le montant total. Il manque " + difference + "€");
        }
        else if (difference == 0) {
            System.out.println("Le montant est exact. Aucune monnaie à rendre.");
        }
        else if (difference > availableTotalAmount) {
            int missingMoney = difference - availableTotalAmount;
            System.out.println("Le distributeur ne possède pas assez de stock pour rendre la monnaie. Il manque " + missingMoney + "€.");
        }
        else {
            System.out.println("Monnaie rendue :");

            int requiredUnits;

            if (difference >= VALUE_BANKNOTE_FIFTY && availableBanknotes50 > 0) {
                requiredUnits = difference / VALUE_BANKNOTE_FIFTY;
                if (requiredUnits > availableBanknotes50) {
                    requiredUnits = availableBanknotes50;
                }
                System.out.println("- " + requiredUnits + " billet" + (requiredUnits > 1 ? "s" : "") + " de " + VALUE_BANKNOTE_FIFTY + "€");
                difference -= requiredUnits * VALUE_BANKNOTE_FIFTY;
                availableBanknotes50 -= requiredUnits;
            }

            if (difference >= VALUE_BANKNOTE_TWENTY && availableBanknotes20 > 0) {
                requiredUnits = difference / VALUE_BANKNOTE_TWENTY;
                if (requiredUnits > availableBanknotes20) {
                    requiredUnits = availableBanknotes20;
                }
                System.out.println("- " + requiredUnits + " billet" + (requiredUnits > 1 ? "s" : "") + " de " + VALUE_BANKNOTE_TWENTY + "€");
                difference -= requiredUnits * VALUE_BANKNOTE_TWENTY;
                availableBanknotes20 -= requiredUnits;
            }

            if (difference >= VALUE_BANKNOTE_TEN && availableBanknotes10 > 0) {
                requiredUnits = difference / VALUE_BANKNOTE_TEN;
                if (requiredUnits > availableBanknotes10) {
                    requiredUnits = availableBanknotes10;
                }
                System.out.println("- " + requiredUnits + " billet" + (requiredUnits > 1 ? "s" : "") + " de " + VALUE_BANKNOTE_TEN + "€");
                difference -= requiredUnits * VALUE_BANKNOTE_TEN;
                availableBanknotes10 -= requiredUnits;
            }

            if (difference >= VALUE_COIN_TWO && availableCoins2 > 0) {
                requiredUnits = difference / VALUE_COIN_TWO;
                if (requiredUnits > availableCoins2) {
                    requiredUnits = availableCoins2;
                }
                System.out.println("- " + requiredUnits + " pièce" + (requiredUnits > 1 ? "s" : "") + " de " + VALUE_COIN_TWO + "€");
                difference -= requiredUnits * VALUE_COIN_TWO;
                availableCoins2 -= requiredUnits;
            }

            if (difference >= VALUE_COIN_ONE && availableCoins1 > 0) {
                requiredUnits = difference / VALUE_COIN_ONE;
                if (requiredUnits > availableCoins1) {
                    requiredUnits = availableCoins1;
                }
                System.out.println("- " + requiredUnits + " pièce" + (requiredUnits > 1 ? "s" : "") + " de " + VALUE_COIN_ONE + "€");
                difference -= requiredUnits * VALUE_COIN_ONE;
                availableCoins1 -= requiredUnits;
            }

            if (difference > 0) {
                System.out.println("Impossible de rendre la monnaie exacte. Capacité du distributeur insuffisante.");
            }

            // Affichage du stock restant (optionnel)
            // System.out.println("\nDans la machine il reste :");
            // System.out.println("- " + availableBanknotes50 + " billet(s) de 50€");
            // System.out.println("- " + availableBanknotes20 + " billet(s) de 20€");
            // System.out.println("- " + availableBanknotes10 + " billet(s) de 10€");
            // System.out.println("- " + availableCoins2 + " pièce(s) de 2€");
            // System.out.println("- " + availableCoins1 + " pièce(s) de 1€");
        }
    }
}

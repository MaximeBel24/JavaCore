package javacore.chapter04.function.exercise;

public class CoinChangerV4 {

    public static void main(String[] args) {

        final int VALUE_BANKNOTE_FIFTY = 50;
        final int VALUE_BANKNOTE_TWENTY = 20;
        final int VALUE_BANKNOTE_TEN = 10;
        final int VALUE_COIN_TWO = 2;
        final int VALUE_COIN_ONE = 1;

        int availableBanknotes50 = 10;
        int availableBanknotes20 = 8;
        int availableBanknotes10 = 5;
        int availableCoins2 = 10;
        int availableCoins1 = 15;

        // Calcul du montant maximal du distributeur
        int availableTotalAmount =
                VALUE_BANKNOTE_FIFTY * availableBanknotes50 +
                        VALUE_BANKNOTE_TWENTY * availableBanknotes20 +
                        VALUE_BANKNOTE_TEN * availableBanknotes10 +
                        VALUE_COIN_TWO * availableCoins2 +
                        VALUE_COIN_ONE * availableCoins1;

        int totalBill = 70;
        int amountPaid = 115;
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

            difference = giveChangeForUnit(VALUE_BANKNOTE_FIFTY, availableBanknotes50, difference);
            difference = giveChangeForUnit(VALUE_BANKNOTE_TWENTY, availableBanknotes20, difference);
            difference = giveChangeForUnit(VALUE_BANKNOTE_TEN, availableBanknotes10, difference);
            difference = giveChangeForUnit(VALUE_COIN_TWO, availableCoins2, difference);
            difference = giveChangeForUnit(VALUE_COIN_ONE, availableCoins1, difference);

            if (difference > 0) {
                System.out.println("Impossible de rendre la monnaie exacte. Capacité du distributeur insuffisante.");
            }

        }
    }

    public static int giveChangeForUnit(int valueUnits, int availableUnits, int remainingChange){
        if (remainingChange >= valueUnits && availableUnits > 0) {
            int requiredUnits = remainingChange / valueUnits;
            if (requiredUnits > availableUnits) {
                requiredUnits = availableUnits;
            }
            System.out.println("- " + requiredUnits + (valueUnits > 2 ? " billet" : " pièce") + (requiredUnits > 1 ? "s" : "") + " de " + valueUnits + "€");
            remainingChange -= requiredUnits * valueUnits;

        }
        return remainingChange;
    }
}

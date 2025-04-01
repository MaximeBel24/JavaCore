package javacore.chapter04.function.exercise;

public class FrenchNetSalaryCalculator {

    public static void main(String[] args){

        final double HOURLY_GROSS_SALARY_SMIC = 11.07;
        final double HOURLY_GROSS_SALARY_MEDIAN = 17.50;
        final double HOURLY_GROSS_SALARY_AVERAGE = 22.50;
        final double HOURLY_GROSS_SALARY_WEALTH_THRESHOLD = 35.00;

        space();

        displayFrenchNetSalary(HOURLY_GROSS_SALARY_SMIC, "SMIC Français en 2022");

        space();

        displayFrenchNetSalary(HOURLY_GROSS_SALARY_MEDIAN, "Salaire Médian Français en 2022");

        space();

        displayFrenchNetSalary(HOURLY_GROSS_SALARY_AVERAGE, "Salaire Moyen Français en 2022");

        space();

        displayFrenchNetSalary(HOURLY_GROSS_SALARY_WEALTH_THRESHOLD, "Seuil de richesse Français en 2022");

    }

    // Affiche les étapes de calcul du salaire net à partir d’un salaire horaire brut
    public static void displayFrenchNetSalary(double hourlyGrossSalary, String category){

        System.out.println("Pour un salaire horaire de " + hourlyGrossSalary + "€ (" + category + ") :");

        step(1, "Calcul du salaire brut annuel : ");
        double annualGrossSalary = calculateAnnualGrossSalary(hourlyGrossSalary);

        step(2, "Calcul du salaire net imposable après l'application des charges sociales : ");
        int socialChargePercentage = determineSocialChargePercentage(annualGrossSalary);
        double annualNetTaxableSalary = applySocialCharges(annualGrossSalary, socialChargePercentage);

        step(3, "Calcul du salaire net annuel imposable après l'application de l'abattement : ");
        final int ABATEMENT = 10;
        double annualNetTaxableSalaryAfterAbatement = applyTaxAllowance(annualNetTaxableSalary, ABATEMENT);

        step(4, "Calcul du salaire net annuel ");
        double finalAnnualNetSalary = applyRevenueTax(annualNetTaxableSalaryAfterAbatement);

        step(5, "Résultat");
        System.out.println(category + " : le salaire net annuel est de " + Math.round(finalAnnualNetSalary) + "€");
    }

    // Affiche une entête d'étape pour rendre la sortie console plus lisible
    public static void step(int number, String title){
        System.out.println();
        System.out.println("Etape " + number + " : " + title);
    }

    // Affiche une ligne de séparation visuelle dans la console
    public static void space(){
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println();
    }

    // Calcule le salaire annuel brut à partir d’un salaire horaire
    public static double calculateAnnualGrossSalary(double hourlyGrossSalary){

        double dailyGrossSalary = hourlyGrossSalary * 7;
        System.out.println("- Le salaire brut journalier est de " + Math.round(dailyGrossSalary) + "€");

        double weeklyGrossSalary = dailyGrossSalary * 5;
        System.out.println("- Le salaire brut hebdomadaire est de " + Math.round(weeklyGrossSalary) + "€");

        double monthlyGrossSalary = weeklyGrossSalary * 4;
        System.out.println("- Le salaire brut mensuel est de " + Math.round(monthlyGrossSalary) + "€");

        double annualGrossSalary = monthlyGrossSalary * 12;
        System.out.println("- Le salaire brut annuel est de " + Math.round(annualGrossSalary) + "€");

        return annualGrossSalary;
    }

    // Détermine le pourcentage de charges sociales selon le salaire brut annuel
    public static int determineSocialChargePercentage(double annualGrossSalary){
        int socialChargePercentage = 0;
        if (annualGrossSalary < 30000) {
            System.out.println("- Le statut est celui d'ouvrier");
            socialChargePercentage = 23;
        } else {
            System.out.println("- Le statut est celui de cadre");
            socialChargePercentage = 25;
        }
        System.out.println("- Le pourcentage de charges sociales est de " + socialChargePercentage + "%");
        return socialChargePercentage;
    }

    // Applique les charges sociales pour obtenir le salaire net imposable
    public static double applySocialCharges(double annualGrossSalary, double socialChargePercentage){


        double socialChargesAmount = annualGrossSalary * socialChargePercentage / 100;
        System.out.println("- Le montant de charges sociales est de " + Math.round(socialChargesAmount) + "€");

        double annualNetTaxableSalary = annualGrossSalary - socialChargesAmount;

        System.out.println("- Le salaire annuel net imposable est de " + Math.round(annualNetTaxableSalary) + "€");
        return annualNetTaxableSalary;
    }

    // Applique l’abattement forfaitaire de 10% dans la limite du plafond fiscal
    public static double applyTaxAllowance(double annualNetSalary, double taxAllowancePercentage){

        final int ABATEMENT_MAXIMUM = 12829; // Plafond de l'abatement en 2022

        double abatementAmount = annualNetSalary * taxAllowancePercentage / 100;
        System.out.println("- Le montant de l'abattement est de " + Math.round(abatementAmount) + "€");
        if (abatementAmount > ABATEMENT_MAXIMUM){
            abatementAmount = ABATEMENT_MAXIMUM;
        }

        double annualNetSalaryAfterAbatement = annualNetSalary - abatementAmount;
        System.out.println("- Le salaire net imposable après l'abattement est de " + Math.round(annualNetSalaryAfterAbatement) + "€");

        return annualNetSalaryAfterAbatement;
    }

    // Applique les tranches d’imposition selon les règles fiscales françaises en 2022
    public static double applyRevenueTax(double annualNetSalary){

        final int TAX_BRACKET_FIRST = 11294;
        final int TAX_BRACKET_SECOND = 28797;
        final int TAX_BRACKET_THIRD = 82341;
        final int TAX_BRACKET_FOURTH = 177106;

        final int TAX_BRACKET_PERCENTAGE_SECOND = 11;
        final int TAX_BRACKET_PERCENTAGE_THIRD = 30;
        final int TAX_BRACKET_PERCENTAGE_FOURTH = 41;
        final int TAX_BRACKET_PERCENTAGE_FIFTH = 45;

        final double TAX_BRACKET_FULL_SECOND = (TAX_BRACKET_SECOND - TAX_BRACKET_FIRST) * 11 / 100;
        final double TAX_BRACKET_FULL_THIRD = ((TAX_BRACKET_THIRD - TAX_BRACKET_SECOND) * 30 / 100) + TAX_BRACKET_FULL_SECOND;
        final double TAX_BRACKET_FULL_FOURTH = ((TAX_BRACKET_FOURTH - TAX_BRACKET_THIRD) * 41 / 100) + TAX_BRACKET_FULL_THIRD;


        if(annualNetSalary <= TAX_BRACKET_FIRST){

            System.out.println("- " + annualNetSalary + "€ correspond à la 1ere tranche.");
            System.out.println("Le salaire net après imposition est de " + annualNetSalary + "€.");

        }
        else if (annualNetSalary <= TAX_BRACKET_SECOND) {

            annualNetSalary = calculateTaxAmount(2, annualNetSalary, TAX_BRACKET_FIRST, 0, TAX_BRACKET_PERCENTAGE_SECOND);

        }
        else if (annualNetSalary <= TAX_BRACKET_THIRD) {

            annualNetSalary = calculateTaxAmount(3, annualNetSalary, TAX_BRACKET_SECOND, TAX_BRACKET_FULL_SECOND, TAX_BRACKET_PERCENTAGE_THIRD);

        }
        else if (annualNetSalary <= TAX_BRACKET_FOURTH) {

            annualNetSalary = calculateTaxAmount(4, annualNetSalary, TAX_BRACKET_THIRD, TAX_BRACKET_FULL_THIRD, TAX_BRACKET_PERCENTAGE_FOURTH);
        }
        else {

            annualNetSalary = calculateTaxAmount(5, annualNetSalary, TAX_BRACKET_FOURTH, TAX_BRACKET_FULL_FOURTH, TAX_BRACKET_PERCENTAGE_FIFTH);

        }

        return annualNetSalary;
    }

    // Calcule l’impôt sur le revenu et le salaire net à partir de la tranche applicable
    public static double calculateTaxAmount(int taxBracketIndex, double annualNetSalary,  int taxBracket, double taxBracketFull,int taxPercentage){
        System.out.println("- " + Math.round(annualNetSalary) + "€ correspond à la " + taxBracketIndex +"eme tranche d'imposition.");
        double taxableSalary = annualNetSalary - taxBracket;
        double taxAmount = (taxableSalary * taxPercentage / 100) + taxBracketFull;
        double totalPercent = taxAmount * 100 / annualNetSalary;
        double finalNetSalary = annualNetSalary - taxAmount;
        System.out.println("- Le taux d'imposition est de " + Math.round(totalPercent) + "%, soit " + Math.round(taxAmount) + "€.");
        return finalNetSalary;
    }

}

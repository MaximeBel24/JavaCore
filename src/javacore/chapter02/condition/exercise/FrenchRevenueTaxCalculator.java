package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void main(String[] args) {
        //10 000, 22 000, 40 000, 100 000, 200 000
        double salary = 220000;
        System.out.println("Votre salaire annuel est de " + salary + "€.");

        int abatement = 10;
        double salaryAfterAbatement = salary - (salary * abatement / 100);
        System.out.println("Après l'abattement de " + abatement + "%, vous êtes imposé sur " + salaryAfterAbatement + "€.");

        int firstTaxBracket = 11294;

        int secondTaxBracket = 28797;
        double secondTaxBracketFull = (secondTaxBracket - firstTaxBracket) * 11 / 100;

        int thirdTaxBracket = 82341;
        double thirdTaxBracketFull = ((thirdTaxBracket - secondTaxBracket) * 30 / 100) + secondTaxBracketFull;

        int fourthTaxBracket = 177106;
        double fourthTaxBracketFull = ((fourthTaxBracket - thirdTaxBracket) * 41 / 100) + thirdTaxBracketFull;

        double netSalary;
        double totalPercent;
        double taxableSalary;
        double taxAmount;

        if(salaryAfterAbatement <= firstTaxBracket){

            System.out.println(salaryAfterAbatement + "€ correspond à la 1ere tranche.");
            System.out.println("Votre salaire net après imposition est de " + salaryAfterAbatement + "€.");

        }
        else if (salaryAfterAbatement <= secondTaxBracket) {

            System.out.println(salaryAfterAbatement + "€ correspond à la 2eme tranche.");
            taxableSalary = salaryAfterAbatement - firstTaxBracket;
            taxAmount = taxableSalary * 11 / 100;
            netSalary = salaryAfterAbatement - taxAmount;
            totalPercent = taxAmount * 100 / salaryAfterAbatement;
            System.out.println("Après imposition vous avez été taxé à hauteur de " + totalPercent + "%, soit " + taxAmount + "€.");
            System.out.println("Votre salaire net est de " + netSalary + "€.");

        }
        else if (salaryAfterAbatement <= thirdTaxBracket) {

            System.out.println(salaryAfterAbatement + "€ correspond à la 3eme tranche.");
            taxableSalary = salaryAfterAbatement - secondTaxBracket;
            taxAmount = (taxableSalary * 30 / 100) + secondTaxBracketFull;
            netSalary = salaryAfterAbatement - taxAmount;
            totalPercent = taxAmount * 100 / salaryAfterAbatement;
            System.out.println("Après imposition vous avez été taxé à hauteur de " + totalPercent + "%, soit " + taxAmount + "€.");
            System.out.println("Votre salaire net est de " + netSalary + "€.");


        }
        else if (salaryAfterAbatement <= fourthTaxBracket) {

            System.out.println(salaryAfterAbatement + "€ correspond à la 4eme tranche.");
            taxableSalary = salaryAfterAbatement - thirdTaxBracket;
            taxAmount = (taxableSalary * 41 / 100) + thirdTaxBracketFull;
            netSalary = salaryAfterAbatement - taxAmount;
            totalPercent = taxAmount * 100 / salaryAfterAbatement;
            System.out.println("Après imposition vous avez été taxé à hauteur de " + totalPercent + "%, soit " + taxAmount + "€.");
            System.out.println("Votre salaire net est de " + netSalary + "€.");

        }
        else {

            System.out.println(salaryAfterAbatement + "€ correspond à la 5eme tranche.");
            taxableSalary = salaryAfterAbatement - fourthTaxBracket;
            taxAmount = (taxableSalary * 45 / 100) + fourthTaxBracketFull;
            netSalary = salaryAfterAbatement - taxAmount;
            totalPercent = taxAmount * 100 / salaryAfterAbatement;
            System.out.println("Après imposition vous avez été taxé à hauteur de " + totalPercent + "%, soit " + taxAmount + "€.");
            System.out.println("Votre salaire net est de " + netSalary + "€.");

        }
    }
}

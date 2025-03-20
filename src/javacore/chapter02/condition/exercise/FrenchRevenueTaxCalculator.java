package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {

    public static void calculateTax(int index, double salaryAfterAbatement, int taxBracket, double taxBracketFull ){
        System.out.println(salaryAfterAbatement + "€ correspond à la " + index +"eme tranche.");
        double taxableSalary = salaryAfterAbatement - taxBracket;
        double taxAmount = (taxableSalary * 30 / 100) + taxBracketFull;
        double netSalary = salaryAfterAbatement - taxAmount;
        double totalPercent = taxAmount * 100 / salaryAfterAbatement;
        System.out.println("Après imposition vous avez été taxé à hauteur de " + Math.round(totalPercent) + "%, soit " + taxAmount + "€.");
        System.out.println("Votre salaire net est de " + netSalary + "€.");
    }

    public static void main(String[] args) {

        //Tested values : 10 000, 22 000, 40 000, 100 000, 200 000
        double salary = 100000;
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

        if(salaryAfterAbatement <= firstTaxBracket){

            System.out.println(salaryAfterAbatement + "€ correspond à la 1ere tranche.");
            System.out.println("Votre salaire net après imposition est de " + salaryAfterAbatement + "€.");

        }
        else if (salaryAfterAbatement <= secondTaxBracket) {

            calculateTax(2, salaryAfterAbatement, firstTaxBracket, 0);

        }
        else if (salaryAfterAbatement <= thirdTaxBracket) {

            calculateTax(3, salaryAfterAbatement, secondTaxBracket, secondTaxBracketFull);

        }
        else if (salaryAfterAbatement <= fourthTaxBracket) {

            calculateTax(4, salaryAfterAbatement, thirdTaxBracket, thirdTaxBracketFull);
        }
        else {

            calculateTax(5, salaryAfterAbatement, fourthTaxBracket, fourthTaxBracketFull);

        }
    }
}

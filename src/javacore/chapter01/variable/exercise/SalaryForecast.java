package javacore.chapter01.variable.exercise;

public class SalaryForecast {

    public static void main(String[] args) {

        short hourlyWage = 25;
        float hourWorkPerDay = 7.7f;

        System.out.println("Maxime est développeur, réside et travaille en France avec le statut de cadre.");
        System.out.println("Son salaire brut par heure est de " + hourlyWage + "€ et il travaille " + hourWorkPerDay + " heures par jour.");

        System.out.println("N°1 --------- Calcul du salaire brut :");
        float grossSalaryPerDay = hourlyWage * hourWorkPerDay;
        float grossSalaryPerWeek = grossSalaryPerDay * 5;
        float grossSalaryPerMonth = grossSalaryPerWeek * 4;
        float grossSalaryPerYear = grossSalaryPerMonth * 12;

        System.out.println("Son salaire brut journalier est de " + grossSalaryPerDay + "€.");
        System.out.println("Son salaire brut hebdomadaire est de " + grossSalaryPerWeek + "€.");
        System.out.println("Son salaire brut mensuel est de " + grossSalaryPerMonth + "€.");
        System.out.println("Son salaire brut annuel est de " + grossSalaryPerYear + "€.");

        float percentageManagementContributions = 25f;
        float managementContributionsPerMonth = grossSalaryPerMonth * percentageManagementContributions / 100;
        float managementContributionsPerYear = grossSalaryPerYear * percentageManagementContributions / 100;
        float netTaxableSalaryPerMonth = grossSalaryPerMonth - managementContributionsPerMonth;
        float netTaxableSalaryPerYear = grossSalaryPerYear - managementContributionsPerYear;

        System.out.println("N°2 --------- Calcul des cotisations sociales :");
        System.out.println("En raison de son statut de cadre, les cotisations sociales sont déduites à hauteur de " + percentageManagementContributions + "%.");
        System.out.println(managementContributionsPerMonth + "€ sont déduits de son salaire brut mensuel.");
        System.out.println("Après cotisations, son salaire net imposable mensuel est de " + netTaxableSalaryPerMonth + "€.");
        System.out.println(managementContributionsPerYear + "€ sont déduits de son salaire brut annuel.");
        System.out.println("Après cotisations, son salaire net imposable annuel est de " + netTaxableSalaryPerYear + "€.");

        float taxRate = 10.5f;
        float taxAmountPerMonth = netTaxableSalaryPerMonth * taxRate / 100;
        double taxAmountPerYear = netTaxableSalaryPerYear * taxRate / 100;
        double netSalaryPerMonth = netTaxableSalaryPerMonth - taxAmountPerMonth;
        double netSalaryPerYear = netTaxableSalaryPerYear - taxAmountPerYear;

        System.out.println("N°3 --------- Calcul des impôts :");
        System.out.println("Ensuite, les impôts lui prélèvent " + taxRate + "% supplémentaires.");
        System.out.println(taxAmountPerMonth + "€ sont donc déduits de son salaire net imposable chaque mois.");
        System.out.println("Son salaire net mensuel est de " + netSalaryPerMonth + "€.");
        System.out.println(taxAmountPerYear + "€ sont donc déduits de son salaire net imposable chaque année.");
        System.out.println("Son salaire net annuel est de " + netSalaryPerYear + "€.");
    }
}

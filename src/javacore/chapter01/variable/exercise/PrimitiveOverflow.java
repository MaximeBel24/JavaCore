package javacore.chapter01.variable.exercise;

public class PrimitiveOverflow {

    public static void main(String[] args) {

        short hourSeconds = 1 * 60 * 60;
        System.out.println("Nombre de secondes dans une heure : " + hourSeconds);

        int daySeconds = hourSeconds * 24;
        System.out.println("Nombre de secondes dans une journée : " + daySeconds);

        int weekSeconds = daySeconds * 7;
        System.out.println("Nombre de secondes dans une semaine : " + weekSeconds);

        int numberDayMonth = 30;
        int monthSeconds = daySeconds * numberDayMonth;
        System.out.println("Nombre de secondes dans un mois : " + monthSeconds);

        int numberDayYear = 365;
        int yearSeconds = daySeconds * numberDayYear;
        System.out.println("Nombre de secondes dans une année : " + yearSeconds);

        int numberDayLeapYear = 366;
        int leapYearSeconds = daySeconds * numberDayLeapYear;
        System.out.println("Nombre de secondes dans une année bissextile : " + leapYearSeconds);

    }
}

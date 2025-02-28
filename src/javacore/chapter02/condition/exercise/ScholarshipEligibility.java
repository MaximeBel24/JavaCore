package javacore.chapter02.condition.exercise;

public class ScholarshipEligibility {

    public static  void main(String[] args){

        // Testing values : 2.5, 3.5, 4.5
        float studentGpa = 4.5f;

        // Testing values : 35 000, 50 000, 65 000
        int householdIncome = 35000;

        // Testing values : true / false
        boolean hasExtracurricular = true;

        if (hasExtracurricular && studentGpa > 3.5){

            if (householdIncome < 40000) {
                System.out.println("L'élève est éligible à une bourse pleine.");
            }
            else if (householdIncome < 60000) {
                System.out.println("L'élève est éligible à une bourse partielle.");
            }
            else {
                System.out.println("L'élève n'est pas éligible à la bourse.");
            }

        }
        else {
            System.out.println("L'élève n'est pas éligible à la bourse.");
        }
    }



}

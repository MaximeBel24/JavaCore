package javacore.chapter02.condition.exercise;

public class NumberComparison {

    public static  void main(String[] args){

        int number1 = 20;
        int number2 = 20;

        if ( number1 > number2 ) {
            System.out.println(number1 + " est supérieur à " + number2);
        } else if ( number1 < number2) {
            System.out.println(number2 + " est supérieur à " + number1);
        } else {
            System.out.println(number1 + " et " + number2 + " ont la même valeur.");
        }
    }
}

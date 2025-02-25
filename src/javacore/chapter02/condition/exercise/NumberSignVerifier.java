package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {

    public static void main(String[] args){

        double number = 25;

        if ( number > 0 ) {
            System.out.println(number + " est positif.");
        }
        if ( number < 0 ) {
            System.out.println(number + " est négatif.");
        }
        if( number == 0 ){
            System.out.println(number + " est neutre.");
        }
    }
}

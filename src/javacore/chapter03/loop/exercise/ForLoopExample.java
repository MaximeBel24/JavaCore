package javacore.chapter03.loop.exercise;

public class ForLoopExample {

    public static void main(String[] args){

        System.out.println("Ordre croissant :");

        for (int number = 1; number <= 10; number++ ){
            System.out.print(number + " ");
        }

        System.out.println(" ");
        System.out.println("Ordre décroissant :");

        for (int number = 10; number >= 1; number-- ){
            System.out.print(number + " ");
        }

        System.out.println(" ");
        System.out.println("Nombre pairs :");

        for (int number = 2; number <= 20; number+=2 ){
            System.out.print(number + " ");
        }

        System.out.println(" ");
        System.out.println("Alphabet :");

        for (char letter = 'A'; letter <= 'Z'; letter++){
            System.out.print(letter + " ");
        }

        System.out.println(" ");
        // Tested Values : 3, 4, 5, 7, 9, 10, 11, 20, 21
        int number = 20;

        long result = 1L;

        if (number < 0 ){
            System.out.println("Erreur : la factorielle d'un nombre négatif est impossible");
        } else if (number == 0) {
            System.out.println("La factorielle de " + number + " est  : " + result);

        }else{

            for (int currentNumber = 1; currentNumber <= number; currentNumber++){
                result *= currentNumber;
            }

            System.out.println("La factorielle de " + number + " est  : " + result);
        }
    }

}

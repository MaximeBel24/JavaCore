package javacore.chapter03.loop.exercise;

public class AlphabetPrinter {

    public static void main(String[] args){

        char letter = 'A';

        while (letter <= 'Z'){
            System.out.print(letter + " ");
            letter++;
        }

        char upperCaseLetter = 'a';

        while (upperCaseLetter <= 'z') {
            System.out.print(upperCaseLetter + " ");
            upperCaseLetter++;
        }

    }
}

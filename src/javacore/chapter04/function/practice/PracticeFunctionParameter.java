package javacore.chapter04.function.practice;

public class PracticeFunctionParameter {

    public static void main(String[] args){

        displaySection(1, "Contenu personnalisé de la section 1");

        System.out.println();

        displaySection(2, "AAAAAAA 1");

        System.out.println();

        displaySection(3, "BBBBBBB 1");

    }

    public static void displaySection(int sectionNumber, String sectionContent){

        System.out.println("-- Début de la section " + sectionNumber);
        displaySeparator();
        System.out.println("-- "  + sectionContent);
        displaySeparator();
        System.out.println("-- Fin de la section " + sectionNumber);

    }

    public static void displaySeparator() {
        System.out.println("-------------------------");
    }
}

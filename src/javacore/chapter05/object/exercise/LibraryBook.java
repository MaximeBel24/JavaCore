package javacore.chapter05.object.exercise;

public class LibraryBook {

    String ISBNNumber;
    String title;
    String author;

    int yearOfPublication;

    boolean isAvailableForBorrowing;

    public void displayInformation() {
        System.out.println("Titre : " + title +
                " | N° ISBN : " + ISBNNumber +
                " | Auteur : " + author +
                " | Année de publication : " + yearOfPublication +
                " | Possibilité d'emprunt : " + (isAvailableForBorrowing ? "disponible" : "non disponible"));
    }

    public static void main(String[] args){

        LibraryBook witcher = new LibraryBook();

        witcher.title = "The Witcher — Tome 1 : Le Dernier Vœu";
        witcher.author = "Andrzej Sapkowski";
        witcher.ISBNNumber = "978-2-35294-140-8";
        witcher.yearOfPublication = 2008;
        witcher.isAvailableForBorrowing = true;

        witcher.displayInformation();
    }
}

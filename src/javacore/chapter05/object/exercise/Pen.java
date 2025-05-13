package javacore.chapter05.object.exercise;

public class Pen {

    String name;
    String color;
    String producer;

    int quantity;

    double price;
    double weight;

    public void displayInformation() {
        System.out.println(
                "Nom: " + name + ", Couleur: " + color + ", Prix: " + price + "€, Quantité: " + quantity + ", Fabricant: " + producer + ", Poids: " + weight + "g");
    }

    public static void main(String[] args) {

        Pen blueBic = new Pen();

        blueBic.name = "Stylo";
        blueBic.color = "Bleu";
        blueBic.producer = "Bic";
        blueBic.quantity = 10;
        blueBic.price = 2.50;
        blueBic.weight = 15;

        blueBic.displayInformation();
    }

}

package javacore.chapter05.object.practice;

public class PracticeObjectCar {

    String serialNumber;
    String brand;
    String model;
    String color;

    double price;
    double odometer;

    public PracticeObjectCar(String serialNumber, String brand, String model, String color, double price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.odometer = 0;

        this.displayInformation();
    }

    public double run(double distance) {
        System.out.println("La voiture roule pendant " + distance + " kms.");
        odometer += distance;
        return distance;
    }

    public void displayInformation() {
        System.out.println("N° série : " + this.serialNumber +
                " | Marque : " + this.brand +
                " | Modèle : " + this.model +
                " | Couleur : " + this.color +
                " | Kilomètrage : " + this.odometer
        );
    }
}

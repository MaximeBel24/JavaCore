package javacore.chapter05.object.practice;

public class PracticeObjectCar {

    String serialNumber;
    String brand;
    String model;
    String color;

    double price;
    double odometer;

    public double run(double distance) {
        System.out.println("La voiture roule pendant " + distance + " kms.");
        odometer += distance;
        return distance;
    }

    public void displayInformation() {
        System.out.println("N° série : " + serialNumber + " | Marque : " + brand + " | Modèle : " + model + " | Couleur : " + color + " | Kilomètrage : " + odometer);
    }
}

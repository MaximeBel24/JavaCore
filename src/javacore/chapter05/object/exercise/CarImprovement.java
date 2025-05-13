package javacore.chapter05.object.exercise;

public class CarImprovement {

    String serialNumber;
    String brand;
    String model;
    String color;

    double price;
    double odometer;

    boolean isEngineStarted;

    public CarImprovement(String serialNumber, String brand, String model, String color, double price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.odometer = 0;
        this.isEngineStarted = false;

        this.displayInformation();
    }

    public void startEngine() {
        this.isEngineStarted = true;
        System.out.println("Le moteur est démarré.");
    }

    public void stopEngine() {
        this.isEngineStarted = false;
        System.out.println("Le moteur est arrêté.");
    }

    public double run(double distance) {
        if (!this.isEngineStarted){
            startEngine();
        }
        System.out.println("La voiture roule pendant " + distance + " kms.");
        odometer += distance;
        return distance;
    }

    public void displayInformation() {
        System.out.println("N° série : " + this.serialNumber +
                " | Marque : " + this.brand +
                " | Modèle : " + this.model +
                " | Couleur : " + this.color +
                " | Prix : " + this.price +
                " | Kilomètrage : " + this.odometer +
                " | Etat : " + ( this.isEngineStarted ? "démarée" : "arrêtée" )
        );
    }

    public static void main(String[] args){

        CarImprovement car = new CarImprovement("VI6546REDHRT", "Lamborgini", "Revuelto", "Orange", 500000);

        car.run(3000);

        car.displayInformation();

        car.run(1000);

        car.stopEngine();

        car.displayInformation();
    }
}

package javacore.chapter05.object.practice;

public class PracticeObject {

    public static void main(String[] args) {

        PracticeObjectCar car1 = new PracticeObjectCar();
        car1.brand = "Ferrari";
        car1.model = "F458";
        car1.color = "Rouge";
        car1.price = 260000;
        car1.odometer = 0;
        car1.serialNumber = "FV5463SDFGUDG543F546HG";

        car1.run(2000);
        car1.displayInformation();

        PracticeObjectCar car2 = new PracticeObjectCar();
        car2.brand = "Ford";
        car2.model = "Mustang";
        car2.color = "Jaune";
        car2.price = 120000;
        car2.odometer = 0;
        car2.serialNumber = "VRGHVJ46571RGDB454BRT";

        car2.run(4000);
        car2.displayInformation();

    }
}

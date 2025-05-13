package javacore.chapter05.object.practice;

public class PracticeObject {

    public static void main(String[] args) {

        PracticeObjectCar car1 = new PracticeObjectCar("FV5463SDFGUDG543F546HG","Ferrari","F458","Rouge", 260000);
        car1.run(2000);
        car1.displayInformation();

        PracticeObjectCar car2 = new PracticeObjectCar("VRGHVJ46571RGDB454BRT", "Ford", "Mustang", "Jaune", 120000);
        car2.run(4000);
        car2.displayInformation();

    }
}

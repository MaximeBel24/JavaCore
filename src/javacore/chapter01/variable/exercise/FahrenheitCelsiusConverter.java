package javacore.chapter01.variable.exercise;

public class FahrenheitCelsiusConverter {

    public static void main(String[] args) {

        double degreesFahrenheit = 50.0;

        double toCelsius = (degreesFahrenheit - 32) / 1.8;

        System.out.println(degreesFahrenheit + "° Celius équivaut à " + toCelsius + "° Fahrenheit.");
    }
}

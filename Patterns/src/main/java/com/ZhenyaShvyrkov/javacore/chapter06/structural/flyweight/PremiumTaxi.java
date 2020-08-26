package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.flyweight;

public class PremiumTaxi implements Taxi{
    private static final String carModel = "TESLA";
    private int pricePerKilometer = 120;

    public double calculateTheCost(double kilometers){
        return kilometers * pricePerKilometer;
    }
}

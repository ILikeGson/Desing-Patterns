package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.flyweight;

public class EconomTaxi implements Taxi{
    private static final String carModel = "KIA_RIO";
    private int pricePerKilometer = 20;

    public double calculateTheCost(double kilometers){
        return kilometers * pricePerKilometer;
    }
}

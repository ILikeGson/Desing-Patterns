package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TaxiFactory {
    private static final Map<String, Taxi> taxis = new HashMap<>();

    public Taxi getTaxi(String serviceLevel){
        Taxi taxi = taxis.get(serviceLevel);
        Random random = new Random();
        if(taxi == null){
            switch (serviceLevel){
                case "econom": {
                    System.out.println("new econom taxi ready to serve people");
                    taxi = new EconomTaxi();
                    break;
                }
                case "premium": {
                    System.out.println("new premium taxi ready to serve people");
                    taxi = new PremiumTaxi();
                    break;
                }
            }
            taxis.put(serviceLevel, taxi);
        }
        System.out.println("Taxi is coming");
        System.out.println(taxi.calculateTheCost(random.nextInt(10)) + " dollars " + taxi.getClass().getSimpleName());
        return taxi;
    }
}

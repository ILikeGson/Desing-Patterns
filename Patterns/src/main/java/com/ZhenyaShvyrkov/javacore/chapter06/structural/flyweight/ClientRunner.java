package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ClientRunner {
    public static void main(String[] args) {
        TaxiFactory factory = new TaxiFactory();
        List<Taxi> list = new ArrayList<>();
        list.add(factory.getTaxi("econom"));
        list.add(factory.getTaxi("econom"));
        list.add(factory.getTaxi("premium"));
        list.add(factory.getTaxi("econom"));
        list.add(factory.getTaxi("econom"));
        list.add(factory.getTaxi("premium"));
        list.add(factory.getTaxi("premium"));
        list.add(factory.getTaxi("premium"));
        list.add(factory.getTaxi("econom"));
        list.add(factory.getTaxi("premium"));


    }

}

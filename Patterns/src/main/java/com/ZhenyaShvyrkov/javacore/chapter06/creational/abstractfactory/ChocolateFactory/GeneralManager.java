package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.ChocolateFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.Manager;

public class GeneralManager implements Manager {
    @Override
    public void manageProgect() {
        System.out.println("General Manager as always does nothing");
    }
}

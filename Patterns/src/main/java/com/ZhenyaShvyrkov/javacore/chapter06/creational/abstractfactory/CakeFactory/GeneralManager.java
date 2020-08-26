package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.CakeFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.Manager;

public class GeneralManager implements Manager {
    @Override
    public void manageProgect() {
        System.out.println("General manager tends to do something useful");
    }
}

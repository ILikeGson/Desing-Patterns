package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.ChocolateFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.Technologist;

public class ChiefTechnologist implements Technologist {
    @Override
    public void controlProcess() {
        System.out.println("Chief Technologist is controlling whole process on factory");
    }
}

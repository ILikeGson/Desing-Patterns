package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.CakeFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.Technologist;

public class SeniorTechnologist implements Technologist {
    @Override
    public void controlProcess() {
        System.out.println("Senior technologist controls process");
    }
}

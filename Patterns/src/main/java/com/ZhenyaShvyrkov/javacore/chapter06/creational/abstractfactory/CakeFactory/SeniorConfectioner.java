package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.CakeFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.Confectioner;

public class SeniorConfectioner implements Confectioner {
    @Override
    public void createChocolate() {
        System.out.println("Senior confectioner decorates cakes");
    }
}

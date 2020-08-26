package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.CakeFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.Baker;

public class SeniorBaker implements Baker {
    @Override
    public void cookChocolate() {
        System.out.println("Senior Baker tries to bake a cake");
    }
}

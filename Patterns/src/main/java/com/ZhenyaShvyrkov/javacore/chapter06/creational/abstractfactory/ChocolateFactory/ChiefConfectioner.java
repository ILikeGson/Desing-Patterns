package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.ChocolateFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.Confectioner;

public class ChiefConfectioner implements Confectioner {
    @Override
    public void createChocolate() {
        System.out.println("Chief Confectioner creates chocolate formula, prepares chocolate for baking and decorates result after");
    }
}

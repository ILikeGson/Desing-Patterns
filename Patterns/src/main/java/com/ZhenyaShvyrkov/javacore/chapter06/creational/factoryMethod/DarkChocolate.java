package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.factoryMethod;

public class DarkChocolate implements Chocolate {
    @Override
    public void eatChocolate() {
        System.out.println("Eat dark chocolate");
    }

    @Override
    public void makeUseOfChocolate() {
        System.out.println("use dark chocolate to cook something else");
    }
}

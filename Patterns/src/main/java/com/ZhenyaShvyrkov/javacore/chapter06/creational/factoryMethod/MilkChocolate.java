package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.factoryMethod;

public class MilkChocolate implements Chocolate{
    @Override
    public void eatChocolate() {
        System.out.println("Eat milk chocolate");
    }

    @Override
    public void makeUseOfChocolate() {
        System.out.println("use milk chocolate to cook something else");
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.factoryMethod;

public class MilkChocolateFactory implements ChocolateFactory{
    @Override
    public Chocolate makeChocolate() {
        return new MilkChocolate();
    }
}

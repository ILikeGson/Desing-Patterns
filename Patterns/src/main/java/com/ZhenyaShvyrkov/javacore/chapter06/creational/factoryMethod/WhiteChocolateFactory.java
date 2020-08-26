package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.factoryMethod;

public class WhiteChocolateFactory implements ChocolateFactory{
    @Override
    public Chocolate makeChocolate() {
        return new WhiteChocolate();
    }
}

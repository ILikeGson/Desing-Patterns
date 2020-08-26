package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.factoryMethod;

public class WhiteChocolate implements Chocolate{
    @Override
    public void eatChocolate() {
        System.out.println("Eat white chocolate");
    }

    @Override
    public void makeUseOfChocolate() {
        System.out.println("use white chocolate to cook something else");
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.factoryMethod;

public class Program {
    public static void main(String[] args) {
        ChocolateFactory factory= createChocolateFactoryByName("white");
        Chocolate chocolate = factory.makeChocolate();
        chocolate.makeUseOfChocolate();
    }
    public static ChocolateFactory createChocolateFactoryByName(String name){
        if(name.equalsIgnoreCase("milk")) return new MilkChocolateFactory();
        else if (name.equalsIgnoreCase("dark")) return new DarkChocolateFactory();
        else if (name.equalsIgnoreCase("white")) return new WhiteChocolateFactory();
        else throw new RuntimeException("that factory is unknown" + name);
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.ChocolateFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.Baker;

public class ChiefBaker implements Baker {
    @Override
    public void cookChocolate() {
        System.out.println("Chief Baker is cooking chocolate bars");
    }
}

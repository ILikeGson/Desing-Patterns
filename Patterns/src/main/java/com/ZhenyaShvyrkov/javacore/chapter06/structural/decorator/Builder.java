package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.decorator;

public class Builder implements Worker{
    @Override
    public void work() {
        System.out.println("Building a new skyscraper");
    }
}

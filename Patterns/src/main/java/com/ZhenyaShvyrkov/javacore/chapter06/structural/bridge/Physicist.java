package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.bridge;

public class Physicist implements Worker{
    @Override
    public void work() {
        System.out.println("Physicist does experiments");
    }
}

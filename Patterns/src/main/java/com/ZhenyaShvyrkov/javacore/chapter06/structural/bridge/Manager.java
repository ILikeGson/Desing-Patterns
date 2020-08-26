package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.bridge;

public class Manager implements Worker{
    @Override
    public void work() {
        System.out.println("Manager does experiments");
    }
}

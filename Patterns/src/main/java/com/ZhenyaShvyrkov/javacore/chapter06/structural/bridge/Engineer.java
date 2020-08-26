package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.bridge;

public class Engineer implements Worker{
    @Override
    public void work() {
        System.out.println("Engineer does trials");
    }
}

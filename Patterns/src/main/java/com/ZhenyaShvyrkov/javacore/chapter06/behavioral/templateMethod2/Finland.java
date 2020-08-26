package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.templateMethod2;

public class Finland implements Country{
    @Override
    public void develop() {
        System.out.println("Not developing at all");
    }

    @Override
    public void help() {
        System.out.println("Finland helping a lot to other");
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.templateMethod2;

public class Poland implements Country{
    @Override
    public void develop() {
        System.out.println("Developing quickly");
    }

    @Override
    public void help() {
        System.out.println("Poland helping a lot to other countries");
    }
}

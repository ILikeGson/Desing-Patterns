package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.state;

public class Discovery implements Channel{
    @Override
    public void broadcast() {
        System.out.println("You are watching Discovery");
    }
}

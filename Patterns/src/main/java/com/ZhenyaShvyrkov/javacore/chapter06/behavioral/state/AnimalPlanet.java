package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.state;

public class AnimalPlanet implements Channel{
    @Override
    public void broadcast() {
        System.out.println("You are watching Animal Planet");
    }
}

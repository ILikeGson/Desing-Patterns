package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Decorator decorator = new NewSkillDecorator(new Builder());
        decorator.work();
    }
}

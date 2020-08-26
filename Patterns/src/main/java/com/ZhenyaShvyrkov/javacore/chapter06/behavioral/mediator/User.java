package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.mediator;

public abstract class User {
    Chat chat;
    String name;

    public User(String name) {
        this.name = name;
    }

    abstract void sendMessage(String message);
    abstract void getMessage(String message, User user);
}

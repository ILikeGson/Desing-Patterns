package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.mediator;

public class SimpleUser extends User{
    public SimpleUser(String name) {
        super(name);
    }

    @Override
    void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    void getMessage(String message, User user) {
        System.out.println(name + " has received a new message from " + user.name +  ": "  + message);
    }
}

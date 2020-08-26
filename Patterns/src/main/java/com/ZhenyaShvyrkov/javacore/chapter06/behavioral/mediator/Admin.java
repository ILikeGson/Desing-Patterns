package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.mediator;

public class Admin extends User{
    public Admin(String name) {
        super(name);
    }

    @Override
    void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    void getMessage(String message, User user) {
        System.out.println("Admin receiving a new message from " + user.name + ": "   + message );
    }
}

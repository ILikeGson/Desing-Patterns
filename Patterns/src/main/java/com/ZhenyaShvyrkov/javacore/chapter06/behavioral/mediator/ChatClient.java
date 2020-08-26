package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatClient implements Chat{
    User admin;
    List<User> users = new ArrayList<>();

    public void addUserToChat(User user){
        users.add(user);
    }

    public void setAdmin(User admin){
        this.admin = admin;
    }
    @Override
    public void sendMessage(String message, User user) {
        if(user instanceof  SimpleUser) {
            for (User u : users) {
                if (u != user) {
                    u.getMessage(message, user);
                }
            }
            admin.getMessage(message, user);
            System.out.println("\n===============================\n");
        }
        if(user instanceof Admin){
            for (User u : users) {
                u.getMessage(message, user);
            }
            admin.getMessage(message, user);
            System.out.println("\n===============================\n");
        }
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.mediator;

public class ChatClientRunner {
    public static void main(String[] args) {
        ChatClient chat = new ChatClient();
        User user = new Admin("Vasya");
        User simpleUser = new SimpleUser("Kolya");
        User simpleUser2 = new SimpleUser("Nikita");
        User simpleUser3 = new SimpleUser("Kostya");

        chat.setAdmin(user);
        chat.addUserToChat(simpleUser);
        chat.addUserToChat(simpleUser2);
        chat.addUserToChat(simpleUser3);

        chat.sendMessage("Hello", user);
        chat.sendMessage("I started to learn a new pattern", simpleUser);
    }

}

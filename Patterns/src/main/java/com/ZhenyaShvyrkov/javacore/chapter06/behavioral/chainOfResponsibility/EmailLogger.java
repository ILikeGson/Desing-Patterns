package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.chainOfResponsibility;

public class EmailLogger extends Logger{
    public EmailLogger(int level) {
        super(level);
    }

    @Override
    void write(String message) {
        System.out.println("Email sending: " + message);
    }
}

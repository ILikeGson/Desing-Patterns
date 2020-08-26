package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.chainOfResponsibility;

public class SMSLogger extends Logger{
    public SMSLogger(int level) {
        super(level);
    }

    @Override
    void write(String message) {
        System.out.println("SMM sending: " + message);
    }
}

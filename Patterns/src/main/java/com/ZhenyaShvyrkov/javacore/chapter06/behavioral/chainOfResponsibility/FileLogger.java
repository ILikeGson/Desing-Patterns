package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.chainOfResponsibility;

public class FileLogger extends Logger {
    public FileLogger(int level) {
        super(level);
    }

    @Override
    void write(String message) {
        System.out.println("File writing: " + message);
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.adapter;

public class JavaApptoApplicationAdapter implements Application {
    private JavaApp javaApp;
    public JavaApptoApplicationAdapter() {
        javaApp = new JavaApp();
    }

    @Override
    public void transfer() {
        javaApp.transferData();
    }

    @Override
    public void write() {
        javaApp.writingData();
    }
}

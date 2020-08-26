package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.adapter;

public class Program {
    public static void main(String[] args) {
        JavaApptoApplicationAdapter adapter = new JavaApptoApplicationAdapter();
        adapter.transfer();
        adapter.write();
    }
}

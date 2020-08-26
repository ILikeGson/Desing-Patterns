package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.observer;

import java.util.List;

public class SimpleObserver implements WebsiteObserver{
    private String name;

    public SimpleObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> updates) {
        updates.forEach(x -> System.out.println(name + " got new message: " + x));
    }
}

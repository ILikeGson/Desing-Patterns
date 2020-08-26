package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Airbnb implements Website{
    private List<WebsiteObserver> subscribers = new ArrayList<>();
    private List<String> updates = new ArrayList<>();


    @Override
    public void addUpdate(String update) {
        updates.add(update);
        notifyObservers(updates);
    }

    @Override
    public void removeUpdate(String update) {
        updates.remove(update);
        notifyObservers(updates);
    }

    @Override
    public void addObserver(WebsiteObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(WebsiteObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(List<String> list) {
        for(WebsiteObserver subscriber : subscribers){
            subscriber.update(list);
        }
    }
}

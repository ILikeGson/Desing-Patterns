package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.observer;

import java.util.List;

public interface Website {
    void addObserver(WebsiteObserver observer);
    void removeObserver(WebsiteObserver observer);
    void notifyObservers(List<String> updates);
    void addUpdate(String update);
    void removeUpdate(String update);
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.observer;

public class ClientRunner {
    public static void main(String[] args) {
        Website website = new Airbnb();
        website.addObserver(new SimpleObserver("vasya"));
        website.addObserver(new SimpleObserver("masha"));

        website.addUpdate("New cozy flat in Helsinki for 24euro per day");
    }
}

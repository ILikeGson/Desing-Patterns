package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.proxy;

public class ClientRunner {
    public static void main(String[] args) {
        Rocket rocket = new ProxyDragon("CRS-1");
        rocket.launch();
    }
}

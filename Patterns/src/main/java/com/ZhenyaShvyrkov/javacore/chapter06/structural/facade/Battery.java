package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.facade;

public class Battery {
    public boolean isEnough(){
        return Math.random() > 0.1;
    }
}

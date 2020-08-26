package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.singleton;

public class King {
    private static King king;
    private King(){}

    public static synchronized King getKing(){
        if(king == null){
            king = new King();
        }
        return king;
    }
}

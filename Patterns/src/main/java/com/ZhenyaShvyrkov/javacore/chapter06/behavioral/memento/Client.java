package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.memento;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game("LVL 1", new Date());
        System.out.println(game.toString());
        File file = new File();
        file.addSave(game.createSave());
        Thread.sleep(10000);
        game.setSave(new Save("LVL 3", new Date()));
        System.out.println(game);

        game.setSave(file.getSave("LVL 1"));
        System.out.println(game);


    }


}

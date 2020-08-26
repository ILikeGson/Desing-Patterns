package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.memento;

import java.util.Date;

public class Game {
    private String level;
    private Date time;

    public Game(String level, Date time) {
        this.level = level;
        this.time = time;
    }

    public void setSave(Save save){
        level = save.getLevel();
        time = save.getTime();
    }

    public Save createSave(){
        return new Save(level, time);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", time=" + time +
                '}';
    }
}

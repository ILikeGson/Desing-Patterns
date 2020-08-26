package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.memento;

import java.util.Date;

public class Save {
    private final String level;
    private final Date time;

    public Save(String level, Date time) {
        this.level = level;
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public Date getTime() {
        return time;
    }
}

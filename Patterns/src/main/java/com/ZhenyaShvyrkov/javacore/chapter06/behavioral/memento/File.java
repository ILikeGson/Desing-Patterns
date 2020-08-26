package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class File {
    private List<Save> list = new ArrayList<>();

    public void addSave(Save save){
        list.add(save);
    }
    public Save getSave(String level){
        for(Save save : list){
            if(save.getLevel().equalsIgnoreCase(level)){
                return save;
            }
        }
        return null;
    }

}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Suitcase implements Item{
    private List<Item> components = new ArrayList<>();

    @Override
    public void useItem() {
        for(Item component : components ){
            component.useItem();
        }
    }
    public void addComponent(Item item){
        components.add(item);
    }
    public void removeComponent(Item item){
        components.remove(item);
    }
}

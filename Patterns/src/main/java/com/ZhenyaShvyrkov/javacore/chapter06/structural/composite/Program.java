package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.composite;

public class Program {
    public static void main(String[] args) {
        Suitcase suitcase = new Suitcase();
        Suitcase suitcase2 = new Suitcase();
        Item item1 = new Brush();
        Item item2 = new Shirt();
        Item item3 = new Soap();
        Item item4 = new Brush();
        Item item5 = new Shirt();
        Item item6 = new Soap();

        suitcase.addComponent(item1);
        suitcase.addComponent(item2);
        suitcase.addComponent(item3);
        suitcase2.addComponent(item4);
        suitcase2.addComponent(item5);
        suitcase2.addComponent(item6);
        suitcase.addComponent(suitcase2);

        suitcase.useItem();
    }


}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.builder;

public class HouseBuilderRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new PrivateHouseBuilder());
        House privateHouse = director.buildHouse();
        System.out.println(privateHouse);
        director.setBuilder(new multiStoreyBuildingBuilder());
        House house = director.buildHouse();
        System.out.println(house);
    }

}

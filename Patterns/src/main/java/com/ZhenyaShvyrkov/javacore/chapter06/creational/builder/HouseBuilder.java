package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.builder;

public abstract class HouseBuilder {
    House house;

    void createHouse(){
        house = new House();
    }
    abstract void buildCompanyName();
    abstract void buildFloorsNumber();
    abstract void buildSectionsNumber();
    abstract void buildCFlatsNumber();
    abstract void buildColor();
    abstract void buildHouseMaterial();

    House getHouse(){
        return house;
    }
}

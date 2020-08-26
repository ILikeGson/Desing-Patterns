package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.builder;

public class Director {
    private HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    House buildHouse(){
        builder.createHouse();
        builder.buildCompanyName();
        builder.buildCFlatsNumber();
        builder.buildColor();
        builder.buildFloorsNumber();
        builder.buildHouseMaterial();
        builder.buildSectionsNumber();
        return builder.getHouse();
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.builder;

public class multiStoreyBuildingBuilder extends HouseBuilder {
    @Override
    void buildCompanyName() {
        house.setCompany(Company.LSR);
    }

    @Override
    void buildFloorsNumber() {
        house.setFloorsNumber(25);
    }

    @Override
    void buildSectionsNumber() {
        house.setSectionsNumber(4);
    }

    @Override
    void buildCFlatsNumber() {
        house.setFlatsNumber(1000);
    }

    @Override
    void buildColor() {
        house.setColor(Color.WHITE);
    }

    @Override
    void buildHouseMaterial() {
        house.setHouseMaterial("Concrete");
    }
}

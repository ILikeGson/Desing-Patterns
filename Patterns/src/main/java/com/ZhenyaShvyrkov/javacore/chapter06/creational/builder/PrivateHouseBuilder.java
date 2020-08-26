package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.builder;

public class PrivateHouseBuilder extends HouseBuilder {
    @Override
    void buildCompanyName() {
        house.setCompany(Company.Skanska);
    }

    @Override
    void buildFloorsNumber() {
        house.setFloorsNumber(3);
    }

    @Override
    void buildSectionsNumber() {
        house.setSectionsNumber(1);
    }

    @Override
    void buildCFlatsNumber() {
        house.setFlatsNumber(1);
    }

    @Override
    void buildColor() {
        house.setColor(Color.GREEN);
    }

    @Override
    void buildHouseMaterial() {
        house.setHouseMaterial("Wood");
    }
}

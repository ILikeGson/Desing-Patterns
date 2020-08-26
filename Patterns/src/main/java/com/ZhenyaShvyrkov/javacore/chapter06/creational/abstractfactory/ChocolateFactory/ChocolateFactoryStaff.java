package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.ChocolateFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.*;

public class ChocolateFactoryStaff implements FactoryTeam {
    @Override
    public Baker getBaker() {
        return new ChiefBaker();
    }

    @Override
    public Manager getManager() {
        return new GeneralManager();
    }

    @Override
    public Technologist getTechnologist() {
        return new ChiefTechnologist();
    }

    @Override
    public Confectioner getСonfectioner() {
        return new ChiefConfectioner();
    }
}

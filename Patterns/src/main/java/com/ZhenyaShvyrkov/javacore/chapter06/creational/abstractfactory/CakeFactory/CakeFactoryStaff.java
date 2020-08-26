package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.CakeFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.*;

public class CakeFactoryStaff implements FactoryTeam {
    @Override
    public Baker getBaker() {
        return new SeniorBaker();
    }

    @Override
    public Manager getManager() {
        return new GeneralManager();
    }

    @Override
    public Technologist getTechnologist() {
        return new SeniorTechnologist();
    }

    @Override
    public Confectioner getСonfectioner() {
        return new SeniorConfectioner();
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.ChocolateFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.*;

public class ChocolateFactoryProject {
    public static void main(String[] args) {
        FactoryTeam staff = new ChocolateFactoryStaff();
        Baker baker = staff.getBaker();
        Technologist technologist = staff.getTechnologist();
        Manager manager = staff.getManager();
        Confectioner confectioner = staff.getСonfectioner();

        System.out.println("Staff start to cook chocolate ");
        manager.manageProgect();
        technologist.controlProcess();
        confectioner.createChocolate();
        baker.cookChocolate();
    }
}

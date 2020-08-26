package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.CakeFactory;

import main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory.*;


public class CakeFactoryProject {
    public static void main(String[] args) {
        FactoryTeam staff = new CakeFactoryStaff();

        Baker baker = staff.getBaker();
        Technologist technologist = staff.getTechnologist();
        Manager manager = staff.getManager();
        Confectioner confectioner = staff.getСonfectioner();

        System.out.println("Team is ready to work");
        manager.manageProgect();
        baker.cookChocolate();
        confectioner.createChocolate();
        technologist.controlProcess();


    }
}

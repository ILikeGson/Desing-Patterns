package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.abstractfactory;

public interface FactoryTeam {
    Baker getBaker();
    Manager getManager();
    Technologist getTechnologist();
    Confectioner getСonfectioner();
}

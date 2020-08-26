package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.bridge;

public abstract class Company {
    Worker worker;
    public Company(Worker worker){
        this.worker = worker;
    }
    abstract void createProduct();
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.bridge;

public class SpaceX extends Company{
    SpaceX(Worker worker){
        super(worker);
    }
    @Override
    void createProduct() {
        worker.work();
        System.out.println("SpaceX lauches rockets ");
    }
}

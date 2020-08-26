package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.bridge;

public class Tesla extends Company{
    Tesla(Worker worker){
        super(worker);
    }

    @Override
    void createProduct() {
        worker.work();
        System.out.println("Tesla releases new car");
    }
}

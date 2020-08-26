package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.bridge;

public class Paypal extends Company{
    Paypal(Worker worker){
        super(worker);
    }

    @Override
    void createProduct() {
        worker.work();
        System.out.println("Paypal makes money transfers");
    }
}

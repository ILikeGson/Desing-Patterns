package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.decorator;

public abstract class Decorator implements Worker{
    Worker worker;
    Decorator(Worker worker){
        this.worker = worker;
    }
    @Override
    public void work() {
        worker.work();
    }
}

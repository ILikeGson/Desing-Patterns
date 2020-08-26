package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.prototype;

public class SuperChargerFactory {
    private SuperCharger superCharger;

    SuperChargerFactory(SuperCharger superCharger){
        this.superCharger = superCharger;
    }
    void setSuperCharger(SuperCharger superCharger){
        this.superCharger = superCharger;
    }
    SuperCharger copySuperCharger(){
        return (SuperCharger) superCharger.copy();
    }

}

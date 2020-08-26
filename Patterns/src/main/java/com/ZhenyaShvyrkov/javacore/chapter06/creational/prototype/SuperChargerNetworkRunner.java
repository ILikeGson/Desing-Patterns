package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.prototype;

public class SuperChargerNetworkRunner {
    public static void main(String[] args) {
        SuperChargerFactory factory1 = new SuperChargerFactory(new SuperCharger(480, "Ukraine", ChargerType.TYPE2));
        SuperCharger superCharger = factory1.copySuperCharger();
        System.out.println(superCharger);
        System.out.println("\n=====================\n");
        SuperChargerFactory factory2 = new SuperChargerFactory(new SuperCharger(480, "Poland", ChargerType.COMBO2));
        SuperCharger superCharger2 = factory2.copySuperCharger();
        System.out.println(superCharger2);
    }


}

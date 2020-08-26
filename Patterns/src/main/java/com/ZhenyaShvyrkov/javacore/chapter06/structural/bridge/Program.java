package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.bridge;

public class Program {
    public static void main(String[] args) {
        Company company = new Tesla(new Engineer());
        company.createProduct();
        System.out.println("\n===============================\n");
        Company company1 = new SpaceX(new Physicist());
        company1.createProduct();
        System.out.println("\n===============================\n");
        Company company2 = new Paypal(new Manager());
        company2.createProduct();
    }
}

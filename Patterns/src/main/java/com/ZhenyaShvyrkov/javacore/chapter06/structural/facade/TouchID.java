package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.facade;

import java.util.Scanner;

public class TouchID {
    public boolean protect() {
        System.out.println("fingerprint is underfined. Enter the password: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equalsIgnoreCase("1234")) {
            System.out.println("Access is allowed");
            return true;
        }
        System.out.println("Incorrect password");
        return false;
    }
}

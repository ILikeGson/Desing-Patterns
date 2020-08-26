package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.templateMethod;

public class StudioRunner {
    public static void main(String[] args) {
        GameStudioTeamplate CDprojectRed = new CDProjectRed();
        GameStudioTeamplate valve = new Valve();

        CDprojectRed.designGame();
        System.out.println("\n----------------------------------\n");
        valve.designGame();
    }
}

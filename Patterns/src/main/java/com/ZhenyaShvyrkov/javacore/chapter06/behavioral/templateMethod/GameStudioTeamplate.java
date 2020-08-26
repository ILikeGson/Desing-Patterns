package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.templateMethod;

public abstract class GameStudioTeamplate {
    public void designGame(){
        System.out.println("Starting to design game");
        System.out.println("Hiring developers to work");
        developGame();
        System.out.println("PR the game");
        System.out.println("Fixing bugs and release");
    }
    public abstract void developGame();
}

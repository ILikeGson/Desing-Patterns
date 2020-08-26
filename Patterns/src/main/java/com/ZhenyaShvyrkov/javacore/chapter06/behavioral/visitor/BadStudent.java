package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.visitor;

public class BadStudent implements Student{
    private String name;
    private int age;
    private int scores;

    public BadStudent(String name, int age, int scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    @Override
    public void visit(Harward harward) {
        System.out.println("i have a little chances to get to harward");
    }

    @Override
    public void visit(Massachusetts massachusetts) {
        System.out.println("i have a little chances to get to harward");
    }

    @Override
    public void visit(Stanford stanford) {
        System.out.println("i have a little chances to get to harward");
    }
}

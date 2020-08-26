package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.visitor;

public class SmartStudent implements Student{
    private String name;
    private int age;
    private int scores;

    public SmartStudent(String name, int age, int scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    @Override
    public void visit(Harward harward) {
        System.out.println("I am visiting harward");
    }

    @Override
    public void visit(Massachusetts massachusetts) {
        System.out.println("I am visiting massachusetts");
    }

    @Override
    public void visit(Stanford stanford) {
        System.out.println("I am visiting stanford");
    }
}

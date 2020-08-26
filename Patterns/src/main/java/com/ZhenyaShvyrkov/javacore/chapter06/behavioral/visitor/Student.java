package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.visitor;

public interface Student {
    void visit(Harward harward);
    void visit(Massachusetts massachusetts);
    void visit(Stanford stanford);
}

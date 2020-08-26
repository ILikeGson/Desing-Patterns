package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.visitor;

public class Massachusetts implements University{
    @Override
    public void accept(Student student) {
        student.visit(this);
    }
}

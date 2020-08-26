package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.interpretator;

public class NumberExpression implements Expression{
    int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

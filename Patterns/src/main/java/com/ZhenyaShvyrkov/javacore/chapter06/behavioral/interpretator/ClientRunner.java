package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.interpretator;

public class ClientRunner {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("1+2+3");
        System.out.println(expression.interpret());
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.interpretator;

public class Context {
    Expression left;
    Expression right;

    public Expression evaluate(String s){
        s = s.trim();
        int pos = s.length() - 1;
        while(pos > 0){
            if(Character.isDigit(s.charAt(pos))) {
                pos--;
            }
            else {
                left = evaluate(s.substring(0, pos));
                right = new NumberExpression(Integer.valueOf(s.substring(pos+1, s.length())));
                switch (s.charAt(pos)){
                    case '+': {
                         return new PlusExpression(left, right);
                    }
                    case '-': {
                        return new MinusExpression(left, right);
                    }
                }
            }
        }
        int result = Integer.valueOf(s);
        return new NumberExpression(result);
    }
}

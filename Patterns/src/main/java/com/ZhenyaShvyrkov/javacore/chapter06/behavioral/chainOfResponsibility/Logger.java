package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.chainOfResponsibility;

public abstract class Logger {
    private int level;
    private Logger next;
    public Logger(int level) {
        this.level = level;
    }

    public void setNext(Logger next){
        this.next = next;
    }
    public void writeMessage(String message, Integer priority){
        if(level <= priority){
            write(message);
        }
        if(next != null){
            next.writeMessage(message, priority);
        }
    }
    abstract void write(String message);

}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Logger logger = new FileLogger(Priority.GOOD);
        Logger logger1 = new EmailLogger(Priority.NORM);
        Logger logger2 = new SMSLogger(Priority.BAD);

        logger.setNext(logger1);
        logger1.setNext(logger2);

        logger.writeMessage("GOOD GOOD GOOD", Priority.GOOD);
        logger.writeMessage("NORMAL", Priority.NORM);
        logger.writeMessage("BAD", Priority.BAD);

    }
}

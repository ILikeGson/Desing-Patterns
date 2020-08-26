package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.command;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}

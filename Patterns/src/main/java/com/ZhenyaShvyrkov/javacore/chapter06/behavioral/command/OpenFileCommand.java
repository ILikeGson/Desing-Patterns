package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.command;

public class OpenFileCommand implements Command{
    private FileSystemReceiver systemReceiver;

    public OpenFileCommand(FileSystemReceiver systemReceiver) {
        this.systemReceiver = systemReceiver;
    }

    @Override
    public void execute() {
        systemReceiver.openFile();
    }
}

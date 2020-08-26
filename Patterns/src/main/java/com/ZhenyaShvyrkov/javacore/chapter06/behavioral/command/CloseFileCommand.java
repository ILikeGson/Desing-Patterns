package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.command;

public class CloseFileCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.closeFile();
    }
}

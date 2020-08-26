package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.command;

public class ClientRunner {
    public static void main(String[] args) {
        FileInvoker invoker = new FileInvoker(new OpenFileCommand(new WindowsFileSystemReceiver()));
        invoker.execute();
        FileInvoker invoker2 = new FileInvoker(new OpenFileCommand(new UnixFileSystemReceiver()));
        invoker2.execute();
    }

}

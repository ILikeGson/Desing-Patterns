package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.state;

public class TVRunner {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.setChannel(new BBC());
        for(int i = 0; i<10; i++){
            tv.changeChannel();
            tv.broadcast();
        }
    }

}

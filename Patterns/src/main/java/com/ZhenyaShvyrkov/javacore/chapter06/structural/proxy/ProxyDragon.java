package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.proxy;

public class ProxyDragon implements Rocket{
    private String spaceOperationName;
    private Dragon rocket;

    public ProxyDragon(String spaceOperationName) {
        this.spaceOperationName = spaceOperationName;
    }


    @Override
    public void launch() {
        if(rocket == null){
            rocket = new Dragon(spaceOperationName);
            rocket.launch();
        }
    }
}

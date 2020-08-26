package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.proxy;

public class Dragon implements Rocket{
    private String spaceOperationName;

    public Dragon(String spaceOperationName) {
        this.spaceOperationName = spaceOperationName;
        buildRocket();
    }

    public void buildRocket(){
        System.out.println("Rocket has been built");
    }

    @Override
    public void launch() {
        System.out.println("Rocket has been launched");
    }
}

package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.facade;

public class Smartphone {
    private Battery battery = new Battery();
    private Camera camera = new Camera();
    private Memory memory = new Memory();
    private Processor processor = new Processor();
    private TouchID touchID = new TouchID();
    private TouchScreen touchScreen = new TouchScreen();
    private VolumeButton volumeButton = new VolumeButton();

    public boolean unlock(){
        if(battery.isEnough() && touchID.protect()){
            System.out.println("Smartphone is ready to be used");
            return true;
        } else {
            System.out.println("Smartphone is locked");
            return false;
        }
    }
    public void takePhoto(){
        if(unlock()) {
            touchScreen.interactWithPerson();
            camera.photo();
            processor.doOperation();
            memory.save();
        }
    }
}

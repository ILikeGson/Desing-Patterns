package main.java.com.ZhenyaShvyrkov.javacore.chapter06.behavioral.state;

public class TV {
    Channel channel;

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void changeChannel(){
        if(channel instanceof BBC) {
            channel = new Discovery();
        } else if(channel instanceof Discovery){
            channel = new AnimalPlanet();
        } else if(channel instanceof AnimalPlanet){
            channel = new BBC();
        }
    }

    public void broadcast(){
        channel.broadcast();
    }
}

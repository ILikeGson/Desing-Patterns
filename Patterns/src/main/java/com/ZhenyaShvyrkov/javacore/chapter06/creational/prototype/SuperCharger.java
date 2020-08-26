package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.prototype;

public class SuperCharger implements Copyable{
    private int voltage;
    private String location;
    private ChargerType type;

    public SuperCharger(int voltage, String location, ChargerType type) {
        this.voltage = voltage;
        this.location = location;
        this.type = type;
    }

    public int getVoltage() {
        return voltage;
    }

    public String getLocation() {
        return location;
    }

    public ChargerType getType() {
        return type;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(ChargerType type) {
        this.type = type;
    }

    @Override
    public Object copy() {
        return new SuperCharger(voltage, location, type);
    }

    @Override
    public String toString() {
        return "SuperCharger{" +
                "voltage=" + voltage +
                ", location='" + location + '\'' +
                ", type=" + type +
                '}';
    }
}

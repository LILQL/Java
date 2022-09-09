package testcomputer;

public class Headphone implements USB {
    public void turnOn() {
        System.out.println("headphone power on");
        System.out.println("bluetooth connected");
    }
    public void turnOff() {
        System.out.println("headphone power off");
    }
}

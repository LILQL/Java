package testcomputer;

public class Keyboard implements USB {
    public void turnOn() {
        System.out.println("Keyboard power on");
    }
    public void turnOff() {
        System.out.println("Keyboard power off");
    }

}

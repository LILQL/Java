package testcomputer;

public class Test {
    public static void main(String[] arg){
        Computer c1 = new Computer();
        System.out.println(c1.toString());

        c1.add(new Keyboard());
        c1.add(new Mouse());
        c1.add(new Headphone());
        c1.powerOn();
        System.out.println("------");
        c1.powerOff();
    }
}



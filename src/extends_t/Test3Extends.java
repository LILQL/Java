package extends_t;


abstract class Grand {
    public abstract void say();
    public Grand(){
        System.out.println("grand constraction");
    }
}

abstract class Father extends Grand {
    public abstract void say();
    public Father(){
        System.out.println("father constraction");
    }
}
class Child extends Father {
    public Child(){
        System.out.println("child constraction");
    }

    @Override
    public void say() {
        // TODO Auto-generated method stub
        
    }
} 

public class Test3Extends{
    public static void main(String[] args) {
        Child c = new Child();
        c.say();
    }
}

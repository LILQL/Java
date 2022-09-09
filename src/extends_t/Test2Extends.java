package extends_t;

class Parent_1{
    public Parent_1(){
        System.out.println("No");
    }
    public void say(){
        System.out.println("This is F");
    }
}
class Child_1 extends Parent_1 {
    public void say(){
        System.out.println("This is C");
    }
}

public class Test2Extends {
    public static void main(String[] args){
        Child_1 c1=new Child_1();
        c1.say();
    }
}


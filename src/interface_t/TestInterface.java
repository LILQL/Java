package interface_t;

interface Parent1 {
    String name="Parent2";
    void work();

}
interface Parent2 {
    public abstract void say();
}
class Child1 implements Parent1,Parent2 {
    public void say(){
        System.out.println("child1");
    }
    public void work(){
        System.out.println("study");
    };
}

public class TestInterface {
    public static void main(String[] args){
        Child1 c = new Child1();
        c.say();
        c.work();
    }
}

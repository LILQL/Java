package extends_t;
class Grand{
    String A;
    public void introduce(){

    }
}

class Parent extends Grand{
    String name;
    double property;
    public Parent(){
        super();
    }
    

    public void say(){
        System.out.println(name+"的财产:"+property);
    }
}
class Child extends Parent
{
    int age;

    public void sayAge(){
        System.out.println(name+"的年龄:"+age);
    }
}
public class TestExtends {
    public static void main(final String[] args){
        final Child c=new Child();
        c.name="xaioming";
        c.property=100;
        c.age=10;
        c.sayAge();
        c.say();
        c.A="2";
    }
}

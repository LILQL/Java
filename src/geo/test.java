package geo;

public class test {
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.toString());
        Rectangle r1 = new Rectangle();
        r1.setSide1(23);
        r1.setSide2(12);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.toString());
        try{

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage);
        }
        Triangle t1 = new Triangle();
        t1.setSide1(5);
        t1.setSide2(6);
        t1.setSide3(7);
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.isTriangle());
        System.out.println(t1.toString());

        
    }
}

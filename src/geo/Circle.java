package geo;

class InvalidRadiusException extends Exception{
    public InvalidRadiusException(){
        super(); 
    }
    public InvalidRadiusException(String message){
        super(message);
    }
}

public class Circle extends Geometric{
    private double radius;
    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    public String toString(){
        return "Circle";
    }
}

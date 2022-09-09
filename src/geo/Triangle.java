package geo;

class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        super(); 
    }
    public IllegalTriangleException(String message){
        super(message);
    }
}
public class Triangle extends Geometric {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(){
        super();
    }
    public Triangle(double side1, double side2, double side3){
        super();
        if(side1+side2>side3 && side1+side3>side2 && side2+side3>side1){
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
        }
            
        else{
            throw new IllegalArgumentException();
        }
            
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public boolean isTriangle(){
        if(side1+side2>side3 && side1+side3>side2 && side2+side3>side1)
            return true;
        else
            return false;
    }
    public String toString(){
        return "Triangle";
    }

}

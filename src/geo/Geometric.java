package geo;

abstract public class Geometric {
    private String color;
    private boolean filled;
    public Geometric() {
        super();
    }
    public Geometric(String color,boolean filled){
        super();
        this.color=color;
        this.filled=filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Geometric";
    }
}

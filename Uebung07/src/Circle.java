public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        super("red");
        this.radius = radius;
    }

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
}

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        super("red");
        this.length = length;
        this.width = width;
    }
    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }

    public String toString(){
        return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
    }
}

public class Shape {
    private String color;
    private double lineWidth;

    public Shape(String color, double lineWidth) {
        this.color = color;
        this.lineWidth = lineWidth;
    }

    public Shape(String color){
        this.color = color;
    }

    public String getcolor(){
        return color;
    }

    public String toString(){
        return "Shape[color=" + color + ",lineWidth=" + lineWidth + "]";
    }
}

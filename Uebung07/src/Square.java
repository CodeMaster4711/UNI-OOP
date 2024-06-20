public class Square extends Rectangle{
    public Square(double side){
        super(side, side);
    }

    public Square(String color, double side){
        super(color, side, side);
    }

    public void setside(double side){
        setLength(side);
        setWidth(side);
    }

    public double getSide(){
        return getLength();
    }

    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public String toString(){
        return "Square[side=" + getLength() + "," + super.toString() + "]";
    }
}

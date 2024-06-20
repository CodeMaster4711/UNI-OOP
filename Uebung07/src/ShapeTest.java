import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    @Test
    public void testCircleArea() {
        Circle circle = new Circle("red", 2.0);
        double expectedArea = Math.PI * Math.pow(2.0, 2);
        assertEquals(expectedArea, circle.getArea(), 0.1);
    }

    @Test
    public void testSquareSetLength() {
        Square square = new Square("blue", 5.0);
        square.setLength(7.0);
        assertEquals(square.getLength(), square.getWidth());
    }

    @Test
    public void testShapeArray() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("red", 1.0);
        shapes[1] = new Square("blue", 5.0);
        shapes[2] = new Rectangle("green", 1.0, 2.0);
        shapes[3] = new Shape("yellow", 1.0);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
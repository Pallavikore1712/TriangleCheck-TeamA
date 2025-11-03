import static org.junit.Assert.*;
import org.junit.Test;

public class EquilateralTriangleTest {

    @Test
    public void testEquilateral() {
        EquilateralTriangle triangle = new EquilateralTriangle();
        assertEquals("Equilateral", triangle.checkTriangle(5, 5, 5));
    }

    @Test
    public void testIsosceles() {
        EquilateralTriangle triangle = new EquilateralTriangle();
        assertEquals("Isosceles", triangle.checkTriangle(5, 5, 3));
    }

    @Test
    public void testScalene() {
        EquilateralTriangle triangle = new EquilateralTriangle();
        assertEquals("Scalene", triangle.checkTriangle(3, 4, 5));
    }

    @Test
    public void testNegativeSides() {
        EquilateralTriangle triangle = new EquilateralTriangle();
        assertEquals("Not a triangle", triangle.checkTriangle(-3, 4, 5));
    }

    @Test
    public void testZeroSides() {
        EquilateralTriangle triangle = new EquilateralTriangle();
        assertEquals("Not a triangle", triangle.checkTriangle(0, 5, 5));
    }

    @Test
    public void testFloatingPrecisionEquilateral() {
        EquilateralTriangle triangle = new EquilateralTriangle();
        // values that are mathematically equal but not exactly equal as doubles
        assertEquals("Equilateral", triangle.checkTriangle(1.0/3.0, 0.3333333333333333, 0.3333333333333333));
    }
}

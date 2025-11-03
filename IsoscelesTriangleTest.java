import org.junit.Test;
import static org.junit.Assert.*;

public class IsoscelesTriangleTest{

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles Triangle", IsoscelesTriangle.checkTriangle(5.0, 5.0, 8.0));
    }

    @Test
    public void testNotIsoscelesTriangle() {
        assertEquals("Forms a triangle but not Isosceles", IsoscelesTriangle.checkTriangle(3.0, 4.0, 5.0));
    }

    @Test
    public void testNotTriangle() {
        assertEquals("Does not form a Triangle", IsoscelesTriangle.checkTriangle(1.0, 2.0, 3.5));
    }

    @Test
    public void testInvalidSides() {
        assertEquals("Does not form a Triangle", IsoscelesTriangle.checkTriangle(-1.0, 4.0, 5.0));
    }
}



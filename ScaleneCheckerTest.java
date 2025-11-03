
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ScaleneCheckerTest {

    ScaleneChecker triangle = new ScaleneChecker();

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene Triangle", triangle.checkTriangle(4, 5, 6));
    }

    @Test
    public void testEqualSides() {
        assertEquals("Forms a triangle but not Scalene", triangle.checkTriangle(5, 5, 3));
    }

    @Test
    public void testInvalidTriangle() {
        assertEquals("Does not form a Triangle", triangle.checkTriangle(1, 2, 3));
    }
}
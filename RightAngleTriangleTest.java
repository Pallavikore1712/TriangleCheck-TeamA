import org.junit.Test;
import static org.junit.Assert.*;

public class RightAngleTriangleTest {

  @Test
  public void testValidTriangle1() {
    boolean result = RightAngleTriangle.isRightAngled(3, 4, 5);
    assertTrue("3,4,5 should form a right-angled triangle", result);
  }

  @Test
  public void testValidTriangle2() {
    boolean result = RightAngleTriangle.isRightAngled(5, 12, 13);
    assertTrue("5,12,13 should form a right-angled triangle", result);
  }
  @Test
  public void testInvalidTriangle1() {
    boolean result = RightAngleTriangle.isRightAngled(2, 3, 4);
    assertFalse("2,3,4 should NOT form a right-angled triangle", result);
  }

  @Test
  public void testValidTriangle3() {
    boolean result = RightAngleTriangle.isRightAngled(8, 15, 17);
    assertTrue("8,15,17 should form a right-angled triangle", result);
  }

  @Test
  public void testValidTriangleDifferentOrder() {
    boolean result = RightAngleTriangle.isRightAngled(13, 5, 12);
    assertTrue("13,5,12 should form a right-angled triangle", result);
  }

  @Test
  public void testEquilateralTriangle() {
    boolean result = RightAngleTriangle.isRightAngled(5, 5, 5);
    assertFalse("5,5,5 should NOT form a right-angled triangle", result);
  }

  @Test
  public void testZeroLengthSide() {
    boolean result = RightAngleTriangle.isRightAngled(0, 4, 5);
    assertFalse("Sides with zero length cannot form a right-angled triangle", result);
  }

  @Test
  public void testNegativeSide() {
    boolean result = RightAngleTriangle.isRightAngled(-3, 4, 5);
    assertFalse("Negative sides cannot form a right-angled triangle", result);
  }

  @Test
  public void testScaledTriangle() {
    boolean result = RightAngleTriangle.isRightAngled(6, 8, 10);
    assertTrue("6,8,10 should form a right-angled triangle", result);
  }
}
public class EquilateralTriangle {

    // Tolerance for comparing double values
    private static final double EPS = 1e-9;

    // returns true if x and y are equal within EPS
    private boolean eq(double x, double y) {
        return Math.abs(x - y) <= EPS;
    }

    public String checkTriangle(double a, double b, double c) {
        // Invalid sides (zero or negative)
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Not a triangle";
        }

        // Check triangle inequality using tolerant comparisons
        if (! (a + b > c - EPS && a + c > b - EPS && b + c > a - EPS) ) {
            return "Not a triangle";
        }

        // Now, compare sides with tolerance
        boolean ab = eq(a, b);
        boolean bc = eq(b, c);
        boolean ac = eq(a, c);

        if (ab && bc) {
            return "Equilateral";
        } else if (ab || bc || ac) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    // Optional main to manually test
    public static void main(String[] args) {
        EquilateralTriangle et = new EquilateralTriangle();
        System.out.println(et.checkTriangle(5, 5, 5));      // Equilateral
        System.out.println(et.checkTriangle(5, 5, 3));      // Isosceles
        System.out.println(et.checkTriangle(3, 4, 5));      // Scalene
        System.out.println(et.checkTriangle(1, 2, 3));      // Not a triangle
        System.out.println(et.checkTriangle(0.3333333, 1.0/3, 1.0/3)); // Equilateral (within EPS)
    }
}

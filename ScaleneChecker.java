
public class ScaleneChecker {

    public String checkTriangle(double a, double b, double c) {

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            return "Does not form a Triangle";
        }

        if (a != b && a != c && b != c) {
            return "Scalene Triangle";
        } else {
            return "Forms a triangle but not Scalene";
        }
    }
}
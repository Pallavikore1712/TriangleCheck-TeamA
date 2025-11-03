 import java.util.Scanner;

public class IsoscelesTriangle{

    public static String checkTriangle(double a, double b, double c) {
        // Check if it forms a valid triangle
        if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
            // Check for isosceles triangle
            if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a)) {
                return "Isosceles Triangle";
            } else {
                return "Forms a triangle but not Isosceles";
            }
        } else {
            return "Does not form a Triangle";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(checkTriangle(a, b, c));
        sc.close();
    }
}

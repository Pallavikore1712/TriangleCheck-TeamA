import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Create objects for all triangle types
        EquilateralTriangle eq = new EquilateralTriangle();
        IsoscelesTriangle iso = new IsoscelesTriangle();
        ScaleneTriangle sca = new ScaleneTriangle();
        RightAngleTriangle rat = new RightAngleTriangle();

        // First, check if the sides can form any valid triangle
        if (!isTriangle(a, b, c)) {
            System.out.println("Does not form a Triangle");
        } 
        // Then, check for right-angled
        else if (RightAngleTriangle.isRightAngled(a, b, c)) {
            System.out.println("Right-Angled Triangle");
        } 
        // Check for equilateral
        else if (eq.checkTriangle(a, b, c).equals("Equilateral")) {
            System.out.println("Equilateral Triangle");
        } 
        // Check for isosceles
        else if (iso.checkTriangle(a, b, c).equals("Isosceles Triangle")) {
            System.out.println("Isosceles Triangle");
        } 
        // Check for scalene
        else if (sca.checkTriangle(a, b, c).equals("Scalene Triangle")) {
            System.out.println("Scalene Triangle");
        } 
        else {
            System.out.println("Forms a triangle but not a specific type");
        }

        sc.close();
    }

    // Helper method to check valid triangle
    public static boolean isTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
               (a + b > c) && (a + c > b) && (b + c > a);
    }
}


import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides of a triangle:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Create objects of all triangle modules
        EquilateralTriangle eq = new EquilateralTriangle();
        IsoscelesTriangle iso = new IsoscelesTriangle();
        ScaleneTriangle sca = new ScaleneTriangle();
        RightAngleTriangle rat = new RightAngleTriangle();

        // Check if it’s a valid triangle at all
        if (!isTriangle(a, b, c)) {
            System.out.println("Does not form a valid triangle");
        } 
        // Check which specific type it is
        else if (eq.isEquilateral(a, b, c)) {
            System.out.println("Equilateral Triangle");
        } 
        else if (iso.isIsosceles(a, b, c)) {
            System.out.println("Isosceles Triangle");
        } 
        else if (rat.isRightAngled(a, b, c)) {
            System.out.println("Right-Angled Triangle");
        } 
        else if (sca.isScalene(a, b, c)) {
            System.out.println("Scalene Triangle");
        } 
        else {
            System.out.println("Unknown Triangle Type");
        }

        sc.close();
    }

    // Helper method to validate triangle inequality
    public static boolean isTriangle(double a, double b, double c) {
        return (a > 0 && b > 0 && c > 0) && 
               (a + b > c && a + c > b && b + c > a);
    }
}


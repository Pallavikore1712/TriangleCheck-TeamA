import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        EquilateralTriangle eq = new EquilateralTriangle();
        IsoscelesTriangle iso = new IsoscelesTriangle();
        ScaleneTriangle sca = new ScaleneTriangle();
        RightAngleTriangle rat = new RightAngleTriangle();

        if (!isTriangle(a, b, c)) {
            System.out.println("Not a valid triangle.");
        } else if (rat.isRightAngled(a, b, c)) {
            System.out.println("Right-Angled Triangle");
        } else if (eq.isEquilateral(a, b, c)) {
            System.out.println("Equilateral Triangle");
        } else if (iso.isIsosceles(a, b, c)) {
            System.out.println("Isosceles Triangle");
        } else if (sca.isScalene(a, b, c)) {
            System.out.println("Scalene Triangle");
        } else {
            System.out.println("Unknown type");
        }

        sc.close();
    }

    public static boolean isTriangle(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }
}

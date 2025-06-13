import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in cm): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = scanner.nextDouble();

        double areaInCm = 0.5 * base * height;
        double areaInInches = areaInCm / 6.4516;

        System.out.println("The Area of the triangle in sq in is " + areaInInches +
                " and sq cm is " + areaInCm);

        scanner.close();
    }
}
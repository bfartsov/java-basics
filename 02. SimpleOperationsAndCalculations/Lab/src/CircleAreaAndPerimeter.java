import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius = scan.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.printf("Area = %f%n", area);
        System.out.printf("Perimeter = %f", perimeter);
    }
}
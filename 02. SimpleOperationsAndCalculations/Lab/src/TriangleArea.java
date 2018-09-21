import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double h = scan.nextDouble();

        double triangleArea = a * h / 2;

        System.out.printf("Triangle area = %.2f", triangleArea);
    }
}
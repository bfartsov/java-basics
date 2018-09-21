import java.util.Scanner;

public class RectangleArea2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double area = Math.abs(x1 - x2 ) * Math.abs(y1 - y2);
        double perimeter = 2 * (Math.abs(x1 - x2 ) + Math.abs(y1 - y2));

        System.out.println(area);
        System.out.println(perimeter);
    }
}
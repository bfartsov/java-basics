import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figureType = scan.nextLine().toLowerCase();
        double area = 0.0;

        switch (figureType) {
            case "square":
                double side = scan.nextDouble();
                area = side * side;
                break;
            case "rectangle":
                double width = scan.nextDouble();
                double height = scan.nextDouble();
                area = width * height;
                break;
            case "circle":
                double radius = scan.nextDouble();
                area = Math.PI * radius * radius;
                break;
            case "triangle":
                double base = scan.nextDouble();
                double vertHeight = scan.nextDouble();
                area = 1/2.0 * base * vertHeight;
                break;
        }
        System.out.printf("%.3f", area);
    }
}
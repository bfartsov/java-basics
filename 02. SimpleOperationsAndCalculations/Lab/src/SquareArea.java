import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double squareArea = a * a;

        System.out.println(squareArea);
    }
}
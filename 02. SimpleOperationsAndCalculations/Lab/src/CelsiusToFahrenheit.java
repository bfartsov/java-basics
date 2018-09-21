import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double celsius = scan.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("%.2f", fahrenheit);
    }
}
import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tables = scan.nextInt();
        double tablesHeight = scan.nextDouble();
        double tablesWidth = scan.nextDouble();

        double coversArea = tables * (tablesHeight + 2 * 0.30) * (tablesWidth + 2 * 0.3);
        double loinsArea = tables * (tablesHeight / 2.0) * (tablesHeight / 2.0);
        double priceDollars = (coversArea * 7) + (loinsArea * 9);
        double priceLeva = priceDollars * 1.85;

        System.out.printf("%.2f USD%n", priceDollars);
        System.out.printf("%.2f BGN", priceLeva);
    }
}
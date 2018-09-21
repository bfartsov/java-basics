import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double whiskeyPrice = scan.nextDouble();
        double beerQuantity = scan.nextDouble();
        double wineQuantity = scan.nextDouble();
        double rakiaQuantity = scan.nextDouble();
        double whiskeyQuantity = scan.nextDouble();

        double rakiaPrice = whiskeyPrice / 2;
        double winePrice = rakiaPrice - (0.4 * rakiaPrice);
        double beerPrice = rakiaPrice - (0.8 * rakiaPrice);
        double rakiaSum = rakiaQuantity * rakiaPrice;
        double wineSum = wineQuantity * winePrice;
        double beerSum = beerQuantity * beerPrice;
        double whiskeySum = whiskeyQuantity * whiskeyPrice;
        double totalSum = rakiaSum + wineSum + beerSum + whiskeySum;

        System.out.printf("%.2f", totalSum);
    }
}
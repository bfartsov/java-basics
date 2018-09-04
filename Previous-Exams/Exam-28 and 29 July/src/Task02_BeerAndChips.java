import java.util.Scanner;

public class Task02_BeerAndChips {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double budget = scan.nextDouble();
        int bottles = scan.nextInt();
        int packetChips = scan.nextInt();

        double beerTotalPrice = 1.20 * bottles;
        double priceChipsPacket = beerTotalPrice * 0.45;
        double chipsPrice = Math.ceil(priceChipsPacket * packetChips);
        double totalPrice = beerTotalPrice + chipsPrice;

        if (totalPrice <= budget) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget-totalPrice);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, totalPrice-budget);
        }

    }
}
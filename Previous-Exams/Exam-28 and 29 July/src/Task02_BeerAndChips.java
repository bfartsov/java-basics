import java.util.Scanner;

public class Task02_BeerAndChips {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double budget = Double.parseDouble(scan.nextLine());
        int bottles = Integer.parseInt(scan.nextLine());
        int packetChips = Integer.parseInt(scan.nextLine());

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
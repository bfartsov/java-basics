import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyFood = Double.parseDouble(scan.nextLine());
        double moneySouvenirs = Double.parseDouble(scan.nextLine());
        double moneyHotel = Double.parseDouble(scan.nextLine());

        double neededLiters = (420 / 100.0) * 7;
        double moneyGasoline = neededLiters * 1.85;
        double spentMoneyFoodSouvenirs = (3 * moneyFood) + (3 * moneySouvenirs);

        double firstDay = moneyHotel * 0.90;
        double secondDay = moneyHotel * 0.85;
        double thirdDay = moneyHotel * 0.80;

        double total = moneyGasoline + spentMoneyFoodSouvenirs + firstDay + secondDay + thirdDay;

        System.out.printf("Money needed: %.2f", total);
    }
}

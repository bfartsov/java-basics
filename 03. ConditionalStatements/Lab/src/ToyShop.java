import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double excursionPrice = scan.nextDouble();
        int puzzlesNumber = scan.nextInt();
        int dollsNumber = scan.nextInt();
        int bearsNumber = scan.nextInt();
        int minionsNumber = scan.nextInt();
        int trucksNumber = scan.nextInt();

        double puzzelPrice = 2.60;
        double dollPrice = 3;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        double sum = puzzlesNumber * puzzelPrice + dollsNumber * dollPrice + bearsNumber * bearPrice
                    + minionsNumber * minionPrice + trucksNumber * truckPrice;
        double allToys = puzzlesNumber + dollsNumber + bearsNumber + minionsNumber + trucksNumber;

        if (allToys >= 50) {
            sum -= (sum * 0.25);
        }

        double rent = sum * 0.10;
        double profit = sum - rent;

        if (profit >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", profit - excursionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - profit);
        }
    }
}
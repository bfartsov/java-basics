import java.util.Scanner;

public class Task02_FootballKit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tshirtPrice = Double.parseDouble(scan.nextLine());
        double moneyForBall = Double.parseDouble(scan.nextLine());

        double pantsPrice = tshirtPrice * 0.75;
        double socksPrice = pantsPrice * 0.2;
        double shoesPrice = (tshirtPrice + pantsPrice) * 2;
        double totalPrice = tshirtPrice + pantsPrice + socksPrice + shoesPrice;
        double priceAfterDiscount = totalPrice - (totalPrice * 0.15);

        if (priceAfterDiscount >= moneyForBall) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", priceAfterDiscount);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", moneyForBall-priceAfterDiscount);
        }
    }
}
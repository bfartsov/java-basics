import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = scan.nextInt();
        int confectioners = scan.nextInt();
        int cakes = scan.nextInt();
        int goffretes = scan.nextInt();
        int pancakes = scan.nextInt();

        double totalSumPerDay = ((cakes * 45) + (goffretes * 5.80) + (pancakes * 3.20)) * confectioners;
        double campaingMoney = totalSumPerDay * days;
        double finalSum = campaingMoney - (campaingMoney * 0.125);

        System.out.printf("%.2f", finalSum);
    }
}
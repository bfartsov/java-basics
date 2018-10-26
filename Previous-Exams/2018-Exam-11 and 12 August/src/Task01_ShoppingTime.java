import java.util.Scanner;

public class Task01_ShoppingTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int breakTime = Integer.parseInt(scan.nextLine());
        double pricePerPart = Double.parseDouble(scan.nextLine());
        double pricePerProgram = Double.parseDouble(scan.nextLine());
        double priceWhiteFrappe = Double.parseDouble(scan.nextLine());

        int relaxTime = (breakTime - 5) - (6 + 4);
        double spentMoneyParts = 3 * pricePerPart;
        double spentMoneyProgram = 2 * pricePerProgram;
        double totalSpentMoney = spentMoneyProgram + spentMoneyParts + priceWhiteFrappe;

        System.out.printf("%.2f%n", totalSpentMoney);
        System.out.println(relaxTime);
    }
}
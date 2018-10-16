import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double priceWashMachine = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int toys = 0;
        int moneyPresent = 0;
        int savedMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                toys++;
            } else {
                moneyPresent += 10;
                savedMoney += moneyPresent;
                savedMoney--;
            }
        }
        int totalMoney = savedMoney + (toys * toyPrice);

        if (totalMoney >= priceWashMachine) {
            System.out.printf("Yes! %.2f", totalMoney - priceWashMachine);
        } else {
            System.out.printf("No! %.2f", priceWashMachine - totalMoney);
        }
    }
}
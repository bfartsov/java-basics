import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countPayments = Integer.parseInt(scan.nextLine());
        int firstPayment = 1;
        double total = 0;

        while (firstPayment <= countPayments) {
            double money = Double.parseDouble(scan.nextLine());

            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", money);
            total += money;
            firstPayment++;
        }
        System.out.printf("Total: %.2f", total);
    }
}
import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String destination = scan.nextLine();
            if (destination.equals("End")) {
                break;
            }
            double budget = Double.parseDouble(scan.nextLine());
            double sum = 0;

            while (budget > sum) {
                double money = Double.parseDouble(scan.nextLine());
                sum += money;
            }
            System.out.printf("Going to %s!%n", destination);
        }
    }
}
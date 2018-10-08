import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tripMoney = Double.parseDouble(scan.nextLine());
        double ownMoney = Double.parseDouble(scan.nextLine());

        int days = 0;
        int countSpend = 0;

        while (true) {
            String action = scan.nextLine(); //"spend" и "save".
            double money = Double.parseDouble(scan.nextLine());

            if (action.equals("spend")) {
                if (money >= ownMoney) {
                    ownMoney = 0;
                } else {
                    ownMoney -= money;
                }
                countSpend++;
            } else if (action.equals("save")) {
                countSpend = 0;
                ownMoney += money;
            }

            days++;

            if (ownMoney >= tripMoney) {
                System.out.printf("You saved the money for %d days.", days);
                break;
            } else if (countSpend >= 5) {
                System.out.println("You can't save the money.");
                System.out.println(days);
                break;
            }

        }
    }
}
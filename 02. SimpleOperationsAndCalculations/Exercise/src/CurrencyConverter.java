import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        String inputCurrency = scan.nextLine();
        String outputCurrency = scan.nextLine();

        if (inputCurrency.equals("USD")) {
            money = money * 1.79549;
        } else if (inputCurrency.equals("EUR")) {
            money = money * 1.95583;
        } else if (inputCurrency.equals("GBP")) {
            money = money * 2.53405;
        }

        if (outputCurrency.equals("USD")) {
            money = money / 1.79549;
        } else if (outputCurrency.equals("EUR")) {
            money = money / 1.95583;
        } else if (outputCurrency.equals("GBP")) {
            money = money / 2.53405;
        }

        System.out.printf("%.2f %s", money, outputCurrency);
    }
}
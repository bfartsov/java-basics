import java.util.Scanner;

public class Task01_StadiumIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sectors = scan.nextInt();
        int capacity = scan.nextInt();
        double ticketPrice = scan.nextDouble();

        double sectorIncomes = (capacity * ticketPrice) / sectors;
        double profit = sectorIncomes * sectors;
        double charity = (profit - (sectorIncomes * 0.75)) / 8;

        System.out.printf("Total income - %.2f BGN%n", profit);
        System.out.printf("Money for charity - %.2f BGN", charity);
    }
}
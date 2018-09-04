import java.util.Scanner;

public class Task01_TripToWorldCup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ticketGo = scan.nextDouble();
        double ticketBack = scan.nextDouble();
        double ticketMatch = scan.nextDouble();
        int matches = scan.nextInt();
        int discount = scan.nextInt();

        double sumPlaneTickets = (6 * (ticketGo + ticketBack));
        double planeTickets = sumPlaneTickets - (sumPlaneTickets * (discount/100.0));
        double totalPriceTicketsMatches = 6 * matches * ticketMatch;
        double totalPrice = planeTickets + totalPriceTicketsMatches;
        double totalPricePerPerson = totalPrice / 6;

        System.out.printf("Total sum: %.2f lv.%n", totalPrice);
        System.out.printf("Each friend has to pay %.2f lv.", totalPricePerPerson);
    }
}
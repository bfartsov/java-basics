import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine().toLowerCase();
        int peopleInGroup = Integer.parseInt(scan.nextLine());

        double ticketPrice = 0;

        if (peopleInGroup >= 1 && peopleInGroup <= 4) {
            budget -= budget * 0.75;
        } else if (peopleInGroup >= 5 && peopleInGroup <= 9) {
            budget -= budget * 0.60;
        } else if (peopleInGroup >= 10 && peopleInGroup <= 24) {
            budget -= budget * 0.50;
        } else if (peopleInGroup >= 25 && peopleInGroup <= 49) {
            budget -= budget * 0.40;
        } else {
            budget -= budget * 0.25;
        }

        if (category.equals("vip")) {
            ticketPrice = 499.99 * peopleInGroup;
        } else {
            ticketPrice = 249.99 * peopleInGroup;
        }

        if (budget >= ticketPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - ticketPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", ticketPrice - budget);
        }
    }
}
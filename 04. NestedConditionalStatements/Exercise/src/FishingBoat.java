import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine().toLowerCase(); // "Spring", "Summer", "Autumn", "Winter"
        int fishers = Integer.parseInt(scan.nextLine());

        double rentShip = 0.0;

        switch (season) {
            case "spring": rentShip = 3000; break;
            case "summer":
            case "autumn":
                rentShip = 4200; break;
            case "winter": rentShip = 2600; break;

        }
        if (fishers <= 6) {
            rentShip -= rentShip * 0.10;
        } else if (fishers >= 7 && fishers <= 11) {
            rentShip -= rentShip * 0.15;
        } else {
            rentShip -= rentShip * 0.25;
        }

        if (fishers % 2 == 0 && !season.equals("autumn")) {
            rentShip -= rentShip * 0.05;
        }

        if (budget >= rentShip) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rentShip);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rentShip - budget);
        }
    }
}
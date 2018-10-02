import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase(); // „summer” или “winter”

        String destination = "";
        String vacationType = "";

        switch (season) {
            case "summer": vacationType = "Camp"; break;
            case "winter": vacationType = "Hotel"; break;
        }

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                budget *= 0.30;
            } else {
                budget *= 0.70;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                budget *= 0.40;
            } else {
                budget *= 0.80;
            }
        } else {
            destination = "Europe";
            budget *= 0.90;
            vacationType = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", vacationType, budget);
    }
}
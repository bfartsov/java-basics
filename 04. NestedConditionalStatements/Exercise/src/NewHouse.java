import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowers = scan.nextLine().toLowerCase(); // "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        int flowersCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double price = 0.0;

        switch (flowers) {
            case "roses":
                price = 5 * flowersCount;
                if (flowersCount > 80) {
                    price -= price * 0.10;
                }
                break;
            case "dahlias":
                price = 3.80 * flowersCount;
                if (flowersCount > 90) {
                    price -= price * 0.15;
                }
                break;
            case "tulips":
                price = 2.80 * flowersCount;
                if (flowersCount > 80) {
                    price -= price * 0.15;
                }
                break;
            case "narcissus":
                price = 3 * flowersCount;
                if (flowersCount < 120) {
                    price += price * 0.15;
                }
                break;
            case "gladiolus":
                price = 2.50 * flowersCount;
                if (flowersCount < 80) {
                    price += price * 0.20;
                }
                break;
        }

        flowers = flowers.substring(0, 1).toUpperCase() + flowers.substring(1);

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowersCount, flowers, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
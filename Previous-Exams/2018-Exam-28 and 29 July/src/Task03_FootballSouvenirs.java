import java.util.Scanner;

public class Task03_FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String team = scan.nextLine();
        String souvenirType = scan.nextLine();
        int souvenirCount = Integer.parseInt(scan.nextLine());

        double totalPrice = 0;
        if (team.equals("Argentina")) {
            if (souvenirType.equals("flags")) {
                totalPrice = souvenirCount * 3.25;
            } else if (souvenirType.equals("caps")) {
                totalPrice = souvenirCount * 7.20;
            } else if (souvenirType.equals("posters")) {
                totalPrice = souvenirCount * 5.10;
            } else if (souvenirType.equals("stickers")) {
                totalPrice = souvenirCount * 1.25;
            } else {
                System.out.println("Invalid stock!");
            }
        } else if (team.equals("Brazil")) {
            if (souvenirType.equals("flags")) {
                totalPrice = souvenirCount * 4.20;
            } else if (souvenirType.equals("caps")) {
                totalPrice = souvenirCount * 8.50;
            } else if (souvenirType.equals("posters")) {
                totalPrice = souvenirCount * 5.35;
            } else if (souvenirType.equals("stickers")) {
                totalPrice = souvenirCount * 1.20;
            } else {
                System.out.println("Invalid stock!");
            }
        } else if (team.equals("Croatia")) {
            if (souvenirType.equals("flags")) {
                totalPrice = souvenirCount * 2.75;
            } else if (souvenirType.equals("caps")) {
                totalPrice = souvenirCount * 6.90;
            } else if (souvenirType.equals("posters")) {
                totalPrice = souvenirCount * 4.95;
            } else if (souvenirType.equals("stickers")) {
                totalPrice = souvenirCount * 1.10;
            } else {
                System.out.println("Invalid stock!");
            }
        } else if (team.equals("Denmark")) {
            if (souvenirType.equals("flags")) {
                totalPrice = souvenirCount * 3.10;
            } else if (souvenirType.equals("caps")) {
                totalPrice = souvenirCount * 6.50;
            } else if (souvenirType.equals("posters")) {
                totalPrice = souvenirCount * 4.80;
            } else if (souvenirType.equals("stickers")) {
                totalPrice = souvenirCount * 0.90;
            } else {
                System.out.println("Invalid stock!");
            }
        } else {
            System.out.println("Invalid country!");
        }

        if (totalPrice > 0) {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenirType, team, totalPrice);
        }
    }
}
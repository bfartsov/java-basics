import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double hallLength = scan.nextDouble();
        double hallWidth = scan.nextDouble();
        double wardrobeSide = scan.nextDouble() * 100;

        double hallSize = (hallLength * 100) * (hallWidth * 100);
        double wardrobeSize = wardrobeSide * wardrobeSide;
        double benchSize = hallSize / 10;
        double freeSpace = hallSize - wardrobeSize - benchSize;
        double dancers = Math.floor(freeSpace / (40 + 7000));

        System.out.printf("%.0f", dancers);
    }
}
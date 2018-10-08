import java.util.Scanner;

public class WaterDispenser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int glassVolume = Integer.parseInt(scan.nextLine());
        int totalWater = 0;
        int dispenserTap = 1;

        while (true) {
            String typeButtons = scan.nextLine();

            switch (typeButtons) {
                case "Easy": totalWater += 50; break;
                case "Medium": totalWater += 100; break;
                case "Hard": totalWater += 200; break;
            }

            if (totalWater > glassVolume) {
                System.out.printf("%dml has been spilled.", totalWater - glassVolume);
                break;
            } else if (totalWater == glassVolume) {
                System.out.printf("The dispenser has been tapped %d times.", dispenserTap);
                break;
            }

            dispenserTap++;
        }
    }
}

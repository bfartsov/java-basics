import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        String winner = "";
        int max = 0;

        while (!name.equals("STOP")) {
            int sum = 0;

            for (int i = 0; i < name.length(); i++) {
                char symbol = name.charAt(i);
                sum += symbol;
            }
            if (sum > max) {
                max = sum;
                winner = name;
            }
            name = scan.nextLine();

        }
        System.out.printf("Winner is %s - %d!", winner, max);
    }
}

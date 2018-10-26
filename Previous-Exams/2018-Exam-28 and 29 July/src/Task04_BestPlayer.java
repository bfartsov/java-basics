import java.util.Scanner;

public class Task04_BestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxGoals = 0;
        String bestPlayer = "";

        while(true) {
            String player = scan.nextLine();
            if (player.equals("END")) {
                break;
            }
            int goalsScored = Integer.parseInt(scan.nextLine());

            if (goalsScored > maxGoals) {
                maxGoals = goalsScored;
                bestPlayer = player;
            }

            if (goalsScored >= 10) {
                break;
            }

        }

        if (maxGoals >= 3) {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %s goals.", maxGoals);
        }
    }
}
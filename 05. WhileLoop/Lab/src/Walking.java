import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalSteps = 0;

        while (true) {
            String input = scan.nextLine();

            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scan.nextLine());
                totalSteps += stepsToHome;
                break;
            } else {
                int steps = Integer.parseInt(input);
                totalSteps += steps;

                if (totalSteps >= 10000) {
                    break;
                }

            }
        }

        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        }
    }
}
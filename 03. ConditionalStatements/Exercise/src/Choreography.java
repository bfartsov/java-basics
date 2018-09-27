import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int steps = scan.nextInt();
        int dancers = scan.nextInt();
        int days = scan.nextInt();

        double stepsPerDay = Math.ceil(((steps / days) / (steps * 1.0)) * 100);
        double stepsPerDancer = stepsPerDay / dancers * 1.0;

        if (stepsPerDay <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", stepsPerDancer);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", stepsPerDancer);
        }
    }
}
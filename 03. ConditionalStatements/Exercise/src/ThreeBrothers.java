import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double firstBrother = scan.nextDouble();
        double secondBrother = scan.nextDouble();
        double thirdBrother = scan.nextDouble();
        double timeForFishing = scan.nextDouble();

        double totalTime = 1 / (1 / firstBrother + 1 / secondBrother + 1 / thirdBrother);
        totalTime += totalTime * 0.15;
        double timeLeft = Math.abs(timeForFishing - totalTime);

        System.out.printf("Cleaning time: %.2f%n", totalTime);
        if (timeLeft >= 0) {
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(timeLeft));
        } else {
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(timeLeft));
        }
    }
}
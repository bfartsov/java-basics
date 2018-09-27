import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstTime = Integer.parseInt(scan.nextLine());
        int secondTime = Integer.parseInt(scan.nextLine());
        int thirdTime = Integer.parseInt(scan.nextLine());

        int allSeconds = firstTime + secondTime + thirdTime;
        int minutes = allSeconds / 60;
        int seconds = allSeconds % 60;

        if (seconds < 10) {
            System.out.println(minutes + ":0" + seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}

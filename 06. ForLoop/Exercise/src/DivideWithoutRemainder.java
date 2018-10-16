import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());

            if (number % 2 == 0) {
                p1++;
            }
            if (number % 3 == 0) {
                p2++;
            }
            if (number % 4 == 0) {
                p3++;
            }
        }

        double p1res = p1 / (n * 1.0) * 100;
        double p2res = p2 / (n * 1.0) * 100;
        double p3res = p3 / (n * 1.0) * 100;

        System.out.printf("%.2f%%%n", p1res);
        System.out.printf("%.2f%%%n", p2res);
        System.out.printf("%.2f%%%n", p3res);
    }
}
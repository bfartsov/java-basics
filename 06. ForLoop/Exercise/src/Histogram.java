import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        double p1res = 0;
        double p2res = 0;
        double p3res = 0;
        double p4res = 0;
        double p5res = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number < 200) {
                p1++;
            } else if (number >= 200 && number <= 399) {
                p2++;
            } else if (number >= 400 && number <= 599) {
                p3++;
            } else if (number >= 600 && number <= 799) {
                p4++;
            } else {
                p5++;
            }
        }
        System.out.printf("%.2f%%%n", p1res = (p1 / n) * 100);
        System.out.printf("%.2f%%%n", p2res = (p2 /n) * 100);
        System.out.printf("%.2f%%%n", p3res = (p3 /n) * 100);
        System.out.printf("%.2f%%%n", p4res = (p4 / n) * 100);
        System.out.printf("%.2f%%%n", p5res = (p5 / n) * 100);
    }
}
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int inputNumber = Integer.parseInt(scan.nextLine());

            if (inputNumber < minNumber) {
                minNumber = inputNumber;
            }
        }
        System.out.println(minNumber);
    }
}
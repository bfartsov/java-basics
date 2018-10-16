import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int inputNumbers = Integer.parseInt(scan.nextLine());

            if (inputNumbers > maxNumber) {
                maxNumber = inputNumbers;
            }
        }
        System.out.println(maxNumber);
    }
}
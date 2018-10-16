import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scan.nextLine());
            if (numbers > maxNum) {
                maxNum = numbers;
            }
            sum += numbers;

        }

        if (sum-maxNum == maxNum) {
            System.out.printf("Yes Sum = %d", sum-maxNum);
        } else {
            System.out.printf("No Diff = %d", Math.abs(maxNum - (sum-maxNum)));
        }
    }
}
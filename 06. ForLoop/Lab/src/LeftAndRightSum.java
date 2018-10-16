import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            int leftNums = Integer.parseInt(scan.nextLine());
            leftSum += leftNums;
        }
        for (int i = 0; i < n; i++) {
            int rightNums = Integer.parseInt(scan.nextLine());
            rightSum += rightNums;
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", rightSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
    }
}
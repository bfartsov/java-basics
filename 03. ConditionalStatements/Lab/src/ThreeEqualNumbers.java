import java.util.Scanner;

public class ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();

        boolean isEqual = firstNumber == secondNumber;

        if (isEqual && thirdNumber == secondNumber && thirdNumber == firstNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
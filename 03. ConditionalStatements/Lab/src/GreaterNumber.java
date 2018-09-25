import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();

        if (firstNumber >= secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}
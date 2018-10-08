import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        while (!command.equals("END")) {
            int number = Integer.parseInt(command);

            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }

            command = scan.nextLine();
        }
        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
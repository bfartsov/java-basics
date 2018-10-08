import java.util.Scanner;

public class NumberInRange1_100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number in Range [1...100]: ");
        int num = Integer.parseInt(scan.nextLine());

        while (num < 1 || num > 100) {
            System.out.println("Invalid number!");
            System.out.print("Number in Range [1...100]: ");
            num = Integer.parseInt(scan.nextLine());
        }

        System.out.printf("The number is: %d", num);
    }
}
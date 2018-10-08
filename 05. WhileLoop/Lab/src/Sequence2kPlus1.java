import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int first = 1;

        while (first <= n) {
            System.out.println(first);

            first = first * 2 + 1;
        }
    }
}
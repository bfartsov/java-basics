import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstWord = scan.nextLine().toLowerCase();
        String secondWord = scan.nextLine().toLowerCase();

        if (firstWord.equals(secondWord)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
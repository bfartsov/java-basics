import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String passwordGuess = scan.nextLine();
        String correctPassword = "s3cr3t!P@ssw0rd";

        if (passwordGuess.equals(correctPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
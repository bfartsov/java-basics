import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int vowelsSum = 0;

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a': vowelsSum += 1; break;
                case 'e': vowelsSum += 2; break;
                case 'i': vowelsSum += 3; break;
                case 'o': vowelsSum += 4; break;
                case 'u': vowelsSum += 5; break;
            }
        }
        System.out.println(vowelsSum);
    }
}
import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int batches = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= batches; i++) {
            String input = scan.nextLine();

            boolean flour = false;
            boolean eggs = false;
            boolean sugar = false;

            while (true) {
                if (input.equals("flour")) {
                    flour = true;
                } else if (input.equals("eggs")) {
                    eggs = true;
                } else if (input.equals("sugar")) {
                    sugar = true;
                }

                if (input.equals("Bake!")) {
                    if (flour && eggs && sugar) {
                        System.out.printf("Baking batch number %d...%n", i);
                        break;
                    } else {
                        System.out.println("The batter should contain flour, eggs and sugar!");
                    }
                }
                input = scan.nextLine();
            }
        }
    }
}
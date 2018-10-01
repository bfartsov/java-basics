import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine().toLowerCase(); // Premiere, Normal, Discount
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        double hallCapacity = rows * cols;
        double price = 0.0;

        if (type.equals("premiere")) {
            price = hallCapacity * 12.00;
        } else if (type.equals("normal")) {
            price = hallCapacity * 7.50;
        } else {
            price = hallCapacity * 5.00;
        }

        System.out.printf("%.2f leva", price);
    }
}
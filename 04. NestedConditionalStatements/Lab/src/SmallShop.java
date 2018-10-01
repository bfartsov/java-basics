import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine().toLowerCase();
        String town = scan.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = 0;

            if (town.equalsIgnoreCase("sofia")) {
                if (product.equalsIgnoreCase("coffee")) {
                    price = quantity * 0.50;
                } else if (product.equalsIgnoreCase("water")) {
                    price = quantity * 0.80;
                } else if (product.equalsIgnoreCase("beer")) {
                    price = quantity * 1.20;
                } else if (product.equalsIgnoreCase("sweets")) {
                    price = quantity * 1.45;
                } else if (product.equalsIgnoreCase("peanuts")) {
                    price = quantity * 1.60;
                }
            } else if (town.equalsIgnoreCase("plovdiv")) {
                if (product.equalsIgnoreCase("coffee")) {
                    price = quantity * 0.40;
                } else if (product.equalsIgnoreCase("water")) {
                    price = quantity * 0.70;
                } else if (product.equalsIgnoreCase("beer")) {
                    price = quantity * 1.15;
                } else if (product.equalsIgnoreCase("sweets")) {
                    price = quantity * 1.30;
                } else if (product.equalsIgnoreCase("peanuts")) {
                    price = quantity * 1.50;
                }
            } else {
                if (product.equalsIgnoreCase("coffee")) {
                    price = quantity * 0.45;
                } else if (product.equalsIgnoreCase("water")) {
                    price = quantity * 0.70;
                } else if (product.equalsIgnoreCase("beer")) {
                    price = quantity * 1.10;
                } else if (product.equalsIgnoreCase("sweets")) {
                    price = quantity * 1.35;
                } else if (product.equalsIgnoreCase("peanuts")) {
                    price = quantity * 1.55;
                }
            }
        System.out.println(price);
    }
}
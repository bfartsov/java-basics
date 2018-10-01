import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine().toLowerCase();
        double sales = Double.parseDouble(scan.nextLine());

        double comission = 0;

        switch (town) {
            case "sofia":
                if (sales >= 0 && sales <= 500) {
                    comission = sales * 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    comission = sales * 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    comission = sales * 0.08;
                } else if (sales > 10000) {
                    comission = sales * 0.12;
                } else {
                    System.out.println("error");
                }
                break;
            case "varna":
                if (sales >= 0 && sales <= 500) {
                    comission = sales * 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    comission = sales * 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    comission = sales * 0.10;
                } else if (sales > 10000) {
                    comission = sales * 0.13;
                } else {
                    System.out.println("error");
                }
                break;
            case "plovdiv":
                if (sales >= 0 && sales <= 500) {
                    comission = sales * 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    comission = sales * 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    comission = sales * 0.12;
                } else if (sales > 10000) {
                    comission = sales * 0.145;
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }

        if (comission > 0) {
            System.out.printf("%.2f", comission);
        }
    }
}
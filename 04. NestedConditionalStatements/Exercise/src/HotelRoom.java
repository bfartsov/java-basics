import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine().toLowerCase();
        int nightsCount = Integer.parseInt(scan.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "may":
            case "october":
                priceStudio = 50;
                priceApartment = 65;
                if (nightsCount > 7 && nightsCount < 14) {
                    priceStudio -= priceStudio * 0.05;
                } else if (nightsCount > 14) {
                    priceStudio -= priceStudio * 0.30;
                }
                break;
            case "june":
            case "september":
                priceStudio = 75.20;
                priceApartment = 68.70;
                if (nightsCount > 14) {
                    priceStudio -= priceStudio * 0.20;
                }
                break;
            case "july":
            case "august":
                priceStudio = 76;
                priceApartment = 77;
                break;
        }

        if (nightsCount > 14) {
            priceApartment -= priceApartment * 0.10;
        }

        System.out.printf("Apartment: %.2f lv.%n", priceApartment * nightsCount);
        System.out.printf("Studio: %.2f lv.", priceStudio * nightsCount);

    }
}

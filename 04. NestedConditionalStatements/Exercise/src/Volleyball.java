import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeYear = scan.nextLine().toLowerCase(); // Leap or Normal
        int holidays = Integer.parseInt(scan.nextLine()); // брой празници в годината (които не са събота и неделя).
        int weekendsInHometown = Integer.parseInt(scan.nextLine()); // брой уикенди, в които Влади си пътува до родния град.

        int weekendsInSofia = 48 - weekendsInHometown;
        double gamesInSofia = weekendsInSofia * (3 / 4.0);
        double gamesInHomeTown = weekendsInHometown;
        double gamesDuringHolidayDay = holidays * (2 / 3.0);
        double allGames = gamesInSofia + gamesInHomeTown + gamesDuringHolidayDay;

        if (typeYear.equals("leap")) {
            allGames += allGames * 0.15;
        }

        System.out.printf("%.0f", Math.floor(allGames));
    }
}
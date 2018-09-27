import java.util.Scanner;

public class TimePlus15Mins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        int totalMin = m + 15;
        int totalHour = hour;

        if (totalMin >= 60) {
            totalHour = totalHour + 1;
            totalMin = totalMin % 60;
        }
        String minFormat = "";
        if (totalMin < 10) {
            minFormat = "0" + totalMin;
        } else {
            minFormat = "" + totalMin;
        }

        if (totalHour >= 24) {
            totalHour = totalHour - 24;
        }

        System.out.printf("%d:%s",totalHour,minFormat);
    }
}
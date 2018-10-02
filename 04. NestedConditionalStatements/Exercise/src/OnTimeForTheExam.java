import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hoursExam = Integer.parseInt(scan.nextLine());
        int minutesExam = Integer.parseInt(scan.nextLine());
        int hoursArrive = Integer.parseInt(scan.nextLine());
        int minutesArrive = Integer.parseInt(scan.nextLine());

        int totalMinExam = hoursExam * 60 + minutesExam;
        int totalMinArrive = hoursArrive * 60 + minutesArrive;

        if (totalMinExam == totalMinArrive || (totalMinExam > totalMinArrive && totalMinExam - totalMinArrive<=30))
        {
            System.out.println("On time");
        }
        if (totalMinExam > totalMinArrive && totalMinExam - totalMinArrive >30)
        {
            System.out.println("Early");
        }
        if (totalMinArrive > totalMinExam)
        {
            System.out.println("Late");
        }
        if (Math.abs(totalMinArrive - totalMinExam)!=0)
        {
            int hours = Math.abs(totalMinArrive - totalMinExam) / 60;
            int mins = Math.abs(totalMinArrive - totalMinExam) % 60;
            if (hours >=1)
            {
                if (mins < 10) System.out.print(hours + ":0" + mins + " hours");
                else System.out.print(hours + ":" + mins + " hours");
            }
            else System.out.print(mins + " minutes");
            if ((totalMinArrive - totalMinExam) < 0)
                System.out.println(" before the start");
            else
                System.out.println(" after the start");
        }
    }
}
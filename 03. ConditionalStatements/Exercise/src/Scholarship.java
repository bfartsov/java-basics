import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double income = scan.nextDouble();
        double grades = scan.nextDouble();
        double meanIncome = scan.nextDouble();

        double socialScolar = meanIncome * 0.35;
        double gradeScolar = grades * 25;

        boolean canTakeExcellent = false;
        boolean canTakeSocial = false;


        if(income < meanIncome && grades > 4.5) {
            canTakeSocial = true;
        }

        if(grades >= 5.5) {
            canTakeExcellent = true;
        }


        if(canTakeSocial == true && canTakeExcellent == true) {
            if(socialScolar >= gradeScolar) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScolar));
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(gradeScolar));
            }
        } else if (canTakeSocial == true) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScolar));
        } else if (canTakeExcellent == true) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(gradeScolar));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
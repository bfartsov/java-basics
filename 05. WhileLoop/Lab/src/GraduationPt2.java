import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int year = 1;
        double sum = 0;

        while (year <= 12) {
            double grade = Double.parseDouble(scan.nextLine());

            if (grade >= 4) {
                sum += grade;
                year++;
            } else {
                break;
            }
        }

        if (year < 12) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double averageGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}

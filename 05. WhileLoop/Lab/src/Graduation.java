import java.util.Scanner;

public class Graduation {
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
            }
        }
        double averageGrade = sum / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
    }
}
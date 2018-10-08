import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int unsatisfiedGrades = Integer.parseInt(scan.nextLine());
        String task = scan.nextLine();
        int numberOfProblem = 0;

        double averageScore = 0;
        String lastProblem = task;
        int counter = 0;

        while (!task.equals("Enough")) {
            lastProblem = task;
            int grade = Integer.parseInt(scan.nextLine());

            if (grade <= 4) {
                counter++;
                if (counter >= unsatisfiedGrades) {
                    break;
                }
            }
            averageScore += grade;
            task = scan.nextLine();
            numberOfProblem++;
        }

        if (counter >= unsatisfiedGrades) {
            System.out.printf("You need a break, %d poor grades.", unsatisfiedGrades);
        } else {
            System.out.printf("Average score: %.2f%n", averageScore / numberOfProblem);
            System.out.printf("Number of problems: %d%n", numberOfProblem);
            System.out.printf("Last problem: %s%n", lastProblem);
        }
    }
}
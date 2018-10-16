import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int openTabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < openTabs; i++) {
            String site = scan.nextLine();

            switch (site) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}

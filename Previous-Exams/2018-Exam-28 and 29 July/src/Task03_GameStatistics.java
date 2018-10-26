import java.util.Scanner;

public class Task03_GameStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mins = Integer.parseInt(scan.nextLine());
        String playerName = scan.nextLine();

        if (mins == 0){
            System.out.println("Match has just began!");
        } else if (mins < 45){
            System.out.println("First half time.");
        } else if (mins >= 45){
            System.out.println("Second half time.");
        }

        if (mins != 0 && mins <= 10){
            System.out.printf("%s missed a penalty.%n",playerName);
            if (mins % 2 == 0){
                System.out.printf("%s was injured after the penalty.",playerName);
            }
        } else if (mins > 10 && mins <= 35){
            System.out.printf("%s received yellow card.%n",playerName);
            if (mins % 2 != 0){
                System.out.printf("%s got another yellow card.",playerName);
            }
        } else if (mins > 35 && mins < 45){
            System.out.printf("%s SCORED A GOAL !!!",playerName);
        } else if (mins > 45 && mins <= 55){
            System.out.printf("%s got a freekick.%n",playerName);
            if (mins % 2 == 0){
                System.out.printf("%s missed the freekick.",playerName);
            }
        } else if (mins > 55 && mins <= 80){
            System.out.printf("%s missed a shot from corner.%n",playerName);
            if (mins % 2 != 0){
                System.out.printf("%s has been changed with another player.",playerName);
            }
        } else if (mins > 80 && mins <= 90){
            System.out.printf("%s SCORED A GOAL FROM PENALTY !!!",playerName);
        }
    }
}
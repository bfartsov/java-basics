import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int width = scan.nextInt();
        int height = scan.nextInt();
        double percent = scan.nextDouble();

        int aquariumVolume = length * width * height;
        double containLiters = aquariumVolume * 0.001;
        double neededLiters = containLiters*(1-(percent * 0.01));

        System.out.printf("%.3f", neededLiters);
    }
}
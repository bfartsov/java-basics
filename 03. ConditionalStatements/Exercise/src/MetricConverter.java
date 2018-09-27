import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double distance = Double.parseDouble(scan.nextLine());
        String inputMetric = scan.nextLine().toLowerCase();
        String outputMetric = scan.nextLine().toLowerCase();

        if (inputMetric.equals("mm")) {
            distance = distance / 1000;
        } else if (inputMetric.equals("cm")) {
            distance = distance / 100;
        } else if (inputMetric.equals("mi")) {
            distance = distance / 0.000621371192;
        } else if (inputMetric.equals("in")) {
            distance = distance / 39.3700787;
        } else if (inputMetric.equals("km")) {
            distance = distance / 0.001;
        } else if (inputMetric.equals("ft")) {
            distance = distance / 3.2808399;
        } else if (inputMetric.equals("yd")) {
            distance = distance / 1.0936133;
        }

        if (outputMetric.equals("mm")) {
            distance = distance * 1000;
        } else if (outputMetric.equals("cm")) {
            distance = distance * 100;
        } else if (outputMetric.equals("mi")) {
            distance = distance * 0.000621371192;
        } else if (outputMetric.equals("in")) {
            distance = distance * 39.3700787;
        } else if (outputMetric.equals("km")) {
            distance = distance * 0.001;
        } else if (outputMetric.equals("ft")) {
            distance = distance * 3.2808399;
        } else if (outputMetric.equals("yd")) {
            distance = distance * 1.0936133;
        }

        System.out.printf("%.8f", distance);
    }
}
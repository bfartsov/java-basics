import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        String operationSymbol = scan.nextLine(); // +, -, *, /, %

        double result = 0;

        if (secondNumber == 0 && (operationSymbol.equals("/") || operationSymbol.equals("%"))) {
            System.out.printf("Cannot divide %d by zero", firstNumber);
        } else {
            switch (operationSymbol) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / (secondNumber * 1.0);
                    break;
                case "%":
                    result = firstNumber % secondNumber;
                    break;
            }
            String evenOrOdd = (result % 2 == 0 && result > 0) ? "even" : "odd";

            if (operationSymbol.equals("+") || operationSymbol.equals("-") || operationSymbol.equals("*")) {
                System.out.printf("%d %s %d = %.0f - %s", firstNumber, operationSymbol, secondNumber, result, evenOrOdd);
            } else if (secondNumber != 0 && operationSymbol.equals("/")) {
                System.out.printf("%d / %d = %.2f", firstNumber, secondNumber, result);
            } else if (secondNumber != 0 && operationSymbol.equals("%")) {
                System.out.println(firstNumber + " % " + secondNumber + " = " + (int)result);
            }
        }
    }
}
import java.util.Scanner;

//Възможните операции са: Събиране(+), Изваждане(-), Умножение(*), Деление(/) и Модулно деление(%).
//При събиране, изваждане и умножение на конзолата трябва да се отпечатат резултата и дали той е четен или нечетен.
//При обикновеното деление – резултата. При модулното деление – остатъка.
//Трябва да се има предвид, че делителят може да е равен на 0(нула), а на нула не се дели.
//В този случай трябва да се отпечата специално съобщениe.

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        String operationSymbol = scan.nextLine();

        double result = 0;

        switch (operationSymbol) {
            case "+":
                result = firstNumber + secondNumber; break;
            case "-":
                result = firstNumber - secondNumber; break;
            case "*":
                result = firstNumber * secondNumber; break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println(result);
                break;
            case "%":
                result = firstNumber % secondNumber; break;
        }

        if (operationSymbol.equals("+") || operationSymbol.equals("-") || operationSymbol.equals("*")) {
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", firstNumber, operationSymbol, secondNumber, result);
            } else {
                System.out.printf("%d %s %d = %d - odd", firstNumber, operationSymbol, secondNumber, result);
            }
        }
    }
}

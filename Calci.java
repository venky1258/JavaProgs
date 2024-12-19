import java.util.Scanner;
import java.util.StringTokenizer;

public class Calci{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a mathematical expression (e.g., 5 + 3):");
        String input = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        int num1 = Integer.parseInt(tokenizer.nextToken());
        String operator = tokenizer.nextToken();
        int num2 = Integer.parseInt(tokenizer.nextToken());

        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Unsupported operator.");
                return;
        }
        System.out.println("The result is: " + result);
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Start.start();
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        try {
            System.out.println("Enter the first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the second number");
            int secondNumber = scanner.nextInt();
            result+= Calculator.addTwoNumbers(firstNumber,secondNumber);
            result+=Calculator.subtractTwoNumbers(firstNumber,secondNumber);
            result+=Calculator.divideTwoNumbers(firstNumber,secondNumber);
            result+=Calculator.multiplyTwoNumbers(firstNumber,secondNumber);
        }
        catch (InputMismatchException e){
            System.out.println("You must enter valid two numbers");
            return;
        }
        System.out.println(result);
        End.end();
    }
}

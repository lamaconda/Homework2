package Calculate;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        System.out.println("Addition");
        System.out.println("Print first number, please");
        Scanner myInput = new Scanner(System.in);
        int firstNumber = myInput.nextInt();

        System.out.println("Print second number, please");
        int secondNumber = myInput.nextInt();

        System.out.println("Adding...");
             int addResult = firstNumber + secondNumber;
        System.out.println(addResult +" is your result");
        System.out.println("Subtracting...");
            int subResult = firstNumber - secondNumber;
        System.out.println(subResult + " is your result");
        System.out.println("Умножаем...");
            int multResult = firstNumber * secondNumber;
        System.out.println(multResult + " is your result");
        System.out.println("Делим...");
        int divResult = firstNumber / secondNumber;
        System.out.println(divResult + " is your result");

    }
}

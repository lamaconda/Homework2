package Task11.ArithmeticMean;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        System.out.println("Hello" );
        System.out.println("Print first number, please");
        Scanner myInput = new Scanner(System.in);
        int firstNumber = myInput.nextInt();

        System.out.println("Print second number, please");
        int secondNumber = myInput.nextInt();

        System.out.println("Print third number, please");
        double thirdNumber = myInput.nextDouble();

        double result = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Arithmetic mean of your numbers is " + result);
    }
}

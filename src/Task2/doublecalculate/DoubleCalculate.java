package Task2.doublecalculate;

import java.util.Scanner;

public class DoubleCalculate {
    public static void main(String[] args) {
        System.out.println("Print first double number, please");
        Scanner myInput = new Scanner(System.in);
        double firstNumber = myInput.nextDouble();

        System.out.println("Print second double number, please");
        double secondNumber = myInput.nextDouble();

        System.out.println("Adding...");
        double addResult = firstNumber + secondNumber;
        System.out.println(addResult +" is your result");
        System.out.println("Subtracting...");
        double subResult = firstNumber - secondNumber;
        System.out.println(subResult + " is your result");
        System.out.println("Умножаем...");
        double multResult = firstNumber * secondNumber;
        System.out.println(multResult + " is your result");
        System.out.println("Делим...");
        double divResult = firstNumber / secondNumber;
        System.out.println(divResult + " is your result");

    }
}

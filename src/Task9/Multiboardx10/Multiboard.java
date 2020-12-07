package Task9.Multiboardx10;

import java.util.Scanner;

class Multiboard {
    public static void main(String[] args) {
        System.out.println("Please, input number to see its multiboard");
        Scanner myInput = new Scanner( System.in );
        int userNumber = myInput.nextInt();


        int result2 = userNumber * 2;
        int result3 = userNumber * 3;
        int result4 = userNumber * 4;
        int result5 = userNumber * 5;
        int result6 = userNumber * 6;
        int result7 = userNumber * 7;
        int result8 = userNumber * 8;
        int result9 = userNumber * 9;
        int result10 = userNumber * 10;

        System.out.println("Here we go!");
        System.out.println(userNumber + " * 1 = " + userNumber);
        System.out.println(userNumber + " * 2 = " + result2);
        System.out.println(userNumber + " * 3 = " + result3);
        System.out.println(userNumber + " * 4 = " + result4);
        System.out.println(userNumber + " * 5 = " + result5);
        System.out.println(userNumber + " * 6 = " + result6);
        System.out.println(userNumber + " * 7 = " + result7);
        System.out.println(userNumber + " * 8 = " + result8);
        System.out.println(userNumber + " * 9 = " + result9);
        System.out.println(userNumber + " * 10 = " + result10);

    }
}

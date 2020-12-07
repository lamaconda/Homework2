package Task8.UserName;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        System.out.println("Please, enter your name");
        Scanner myInput = new Scanner(System.in);
        String userName = myInput.nextLine();
        System.out.println("Hello " + userName);
    }
}

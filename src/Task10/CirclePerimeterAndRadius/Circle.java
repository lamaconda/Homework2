package Task10.CirclePerimeterAndRadius;

import java.util.Scanner;

 class Circle {
    public static void main(String[] args) {
        System.out.println("Please enter radius of your circle");
        Scanner myScan = new Scanner( System.in );
        double userRadius = myScan.nextDouble();

        double perimeter = Math.PI * 2*userRadius;
        System.out.println("Perimeter is = " + perimeter);
        double area = Math.PI * (userRadius * userRadius);
        System.out.println("Area is = " + area);
    }
}

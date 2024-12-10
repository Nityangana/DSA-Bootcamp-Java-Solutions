// Area Of Triangle

import java.util.Scanner;
public class Question2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        // ask user to input base and height of triangle
        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter base of triangle: ");
        double height = input.nextDouble();

        double area = 0.5*base*height;
        System.out.println("Area of the triangle is: "+area);

    }
}

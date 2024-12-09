// Area Of Circle Java Program

import java.util.Scanner;
public class Question1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        // ask user for radius of the circle
        System.out.print("Enter radius of circle: ");
        double r = input.nextDouble();
        double area = Math.PI * Math.pow(r,2);
        System.out.println("Area of the circle is: "+area);
    }
}
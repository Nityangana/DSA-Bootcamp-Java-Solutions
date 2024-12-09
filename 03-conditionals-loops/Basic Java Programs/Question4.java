// Area Of Isosceles Triangle

import java.util.Scanner;
public class Question4 {
    public static void main (String[] args ) {
        // ask user to input the equal and unequal 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of two equal sides: ");
        double a = input.nextDouble();
        System.out.print("Enter the length of the unequal side: ");
        double base = input.nextDouble();
        // calculate height of the isosceles triangle
        double height = Math.sqrt( Math.pow(a,2) - (Math.pow(base,2)/4) );
        // calculate area
        double area = 0.5*base*height;
        System.out.println("Area of the triangle is: "+area);


    }
}

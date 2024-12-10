// Area Of Rectangle Program

import java.util.Scanner;
public class Question3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = input.nextDouble();

        double area = length * breadth;
        System.out.println("Area of the rectangle is: "+area);
    }    
}

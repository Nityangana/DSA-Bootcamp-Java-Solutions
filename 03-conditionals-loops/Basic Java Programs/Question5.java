// Area Of Parallelogram

import java.util.Scanner;
public class Question5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of parallelogram: ");
        double base = input.nextDouble();
        System.out.print("Enter height of parallelogram: ");
        double height = input.nextDouble();

        double area = base*height;
        System.out.println("Area of parallelogram is: "+area);
    }
}

// Perimeter Of Parallelogram

import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one side of parallelogram: ");
        double side1 = input.nextDouble();
        System.out.print("Enter other side of parallelogram: ");
        double side2 = input.nextDouble();
        double p = 2*(side1+side2);
        System.out.println("Perimeter of the parallelogram is: "+p);
    }
}

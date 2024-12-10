// Area Of Equilateral Triangle

import java.util.Scanner;
public class Question7 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter leength of side: ");
        double side = input.nextDouble();
        double area = (Math.sqrt(3)/4)*Math.pow(side,2);
        System.out.println("Area of equilateral triangle is: "+area);
    }
}

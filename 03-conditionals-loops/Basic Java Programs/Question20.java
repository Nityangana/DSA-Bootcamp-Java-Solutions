// Total Surface Area Of Cube

import java.util.Scanner;
public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of side of cube: ");
        double side = input.nextDouble();
        
        double area = 6 * side;
        System.out.println("Total surface area of the cube is: "+area);
    }
}
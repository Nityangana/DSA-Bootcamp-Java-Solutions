// Volume Of Cone Java Program

import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of cone: ");
        double radius = input.nextDouble();
        System.out.print("Enter height of cone: ");
        double height = input.nextDouble();
        double volume = Math.PI*Math.pow(radius,2)*height/3;
        System.out.println("Volume of the cone is: "+volume);
    }
}

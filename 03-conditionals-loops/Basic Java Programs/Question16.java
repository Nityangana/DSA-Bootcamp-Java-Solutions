// Volume Of Cylinder
import java.util.Scanner;
public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double height = input.nextDouble();
        double volume = Math.PI*Math.pow(radius,2)*height;
        System.out.println("Volume of the cylinder is: "+volume);
    }
}

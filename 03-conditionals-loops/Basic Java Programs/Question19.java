// Curved Surface Area Of Cylinder
import java.util.Scanner;
public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter height of cylinder: ");
        double height = input.nextDouble();

        double CSA = 2 * Math.PI * radius * height;
        System.out.println("Curved surface area of the cylinder is: "+CSA);
    }
}

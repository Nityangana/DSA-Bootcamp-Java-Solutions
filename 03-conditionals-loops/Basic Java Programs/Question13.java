// Perimeter Of Rhombus
import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of rhombus: ");
        double side = input.nextDouble();
        double p = 4*side;
        System.out.println("Perimeter of the rhombus is: "+p);
    }
}

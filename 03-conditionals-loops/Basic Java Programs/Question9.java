// Perimeter Of Equilateral Triangle
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of equilateral traingle: ");
        double side = input.nextDouble();
        double p = 3*side;
        System.out.println("Perimeter of the traingle is: "+p);
    }
}

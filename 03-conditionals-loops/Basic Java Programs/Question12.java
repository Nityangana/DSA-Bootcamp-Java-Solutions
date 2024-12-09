// Perimeter Of Square
import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        double side = input.nextDouble();
        double p = 4*side;
        System.out.println("Perimeter of the square is: "+p);
    }
}

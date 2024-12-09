// Perimeter Of Rectangle
import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = input.nextDouble();
        double p = 2*(length+width);
        System.out.println("Perimeter of the rectangle is: "+p);
    }
}

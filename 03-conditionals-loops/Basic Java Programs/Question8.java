// Perimeter Of Circle
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = input.nextDouble();
        double p = 2*Math.PI*r;
        System.out.println("Perimeter of the circle is: "+p);
    }
}

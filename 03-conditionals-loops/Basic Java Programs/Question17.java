// Volume Of Sphere
import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");
        double radius = input.nextDouble();
        double volume = ( 4* Math.PI * Math.pow(radius,3) )/3;
        System.out.println("Volume of the sphere is: "+volume);
    }
}

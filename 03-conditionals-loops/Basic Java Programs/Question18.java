// Volume Of Pyramid
import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base length of pyramid: ");
        double length = input.nextDouble();

        System.out.print("Enter base width of pyramid: ");
        double width = input.nextDouble();

        System.out.print("Enter height of pyramid: ");
        double height = input.nextDouble();

        double volume = (length*width*height)/3;
        System.out.println("Volume of the pyramid is: "+volume);
    }
}

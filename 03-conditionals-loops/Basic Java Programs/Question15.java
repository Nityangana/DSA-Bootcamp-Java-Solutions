// Volume Of Prism
import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of prism: ");
        double base = input.nextDouble();
        System.out.print("Enter height of cone: ");
        double height = input.nextDouble();
        double volume = base*height;
        System.out.println("Volume of the prism is: "+volume);
    }
}

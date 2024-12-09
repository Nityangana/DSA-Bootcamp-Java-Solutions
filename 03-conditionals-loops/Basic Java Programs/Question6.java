// Area Of Rhombus
import java.util.Scanner;
public class Question6 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one diagonal leength: ");
        double d1 = input.nextDouble();
        System.out.print("Enter another diagonal leength: ");
        double d2 = input.nextDouble();
        double area = 0.5*d1*d2;
        System.out.println("Area of the rhombus is: "+area);
    } 
}

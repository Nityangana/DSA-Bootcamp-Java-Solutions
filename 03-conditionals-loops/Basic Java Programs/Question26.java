// Addition Of Two Numbers
import java.util.Scanner;
public class Question26 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        System.out.println("Sum of two numbers is: "+ (num1+num2));
    }
}

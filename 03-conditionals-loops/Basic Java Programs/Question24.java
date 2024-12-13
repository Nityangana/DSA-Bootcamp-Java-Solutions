// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;
public class Question24 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;

        while(n!=0) {
            sum = sum + n;
            System.out.print("Enter a number: ");
            n = input.nextInt();
        }
        System.out.println("Sum of all numbers is: "+ sum);
    }
}

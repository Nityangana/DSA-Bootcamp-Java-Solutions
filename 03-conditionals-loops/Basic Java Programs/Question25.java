// Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class Question25 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int max = n;

        while(n!=0) {
            System.out.print("Enter a number: ");
            n = input.nextInt();
            max = Math.max(max,n);
        }
        System.out.println(max+" is the largest of all the numbers.");
    }
}

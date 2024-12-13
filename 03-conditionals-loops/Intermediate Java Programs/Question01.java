// Factorial Program In Java
import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num<0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else if (num==0 || num==1) {
            System.out.println("Factorial of "+num+" is: "+ 1);
        }
        else {
            int fact = 1;
            for (int i=num; i>1;i--) {
                fact = fact * i;
                System.out.println(fact);
            }
            System.out.println("Factorial of "+num+" is: "+ fact);
        }
    }
}

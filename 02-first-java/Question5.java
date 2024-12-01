// Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class Question5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        System.out.println(Math.max(num1,num2)+" is the larger of the two.");
    }
}

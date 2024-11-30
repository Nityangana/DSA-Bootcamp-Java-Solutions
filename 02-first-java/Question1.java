// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		//Prompt the user to input values
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		// Check whether number is even or odd
		if (num%2==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
        
    }
}



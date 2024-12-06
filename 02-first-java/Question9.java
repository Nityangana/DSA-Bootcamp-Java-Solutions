// To find Armstrong Number between two given number.

import java.util.Scanner;
public class Question9 {
    public static void main (String[] args) {

        // Take two numbers from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an armstrong number: ");
        String num1 = input.next();
        System.out.print("Enter a non-armstrong number: ");
        String num2 = input.next();

        // Calculate armstrong number for num1
        int sum1 =0;
        for (char i: num1.toCharArray()) {
            sum1 = sum1 + (int)Math.pow(Integer.valueOf(i-'0'),num1.length());
        }
        
        // Calculate armstrong number for num2
        int sum2 =0;
        for (char i: num2.toCharArray()) {
            sum2 = sum2 + (int)Math.pow(Integer.valueOf(i-'0'),num2.length());
        }

        // Check which of the two is an armstron number
        if (sum1==Integer.valueOf(num1)) {
            System.out.println(sum1+" is an armstrong number.");
        }
        else if (sum2==Integer.valueOf(num2)) {
            System.out.println(sum2+" is an armstrong number.");
        }
        
    }
}

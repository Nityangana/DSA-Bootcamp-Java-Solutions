// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;
public class Question2 {
    public static void main (String[] args) {
        System.out.print("Enter a name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello "+name+". My name is Nitya. Nice to meet you!");
    }
}

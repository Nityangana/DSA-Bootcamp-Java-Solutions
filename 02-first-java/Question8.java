// To find out whether the given String is Palindrome or not.

import java.util.Scanner;
public class Question8 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        int size = str.length();
        boolean string = true;
        if (str.length()<2) {
            System.out.println(str+" is a palindrome.");
        }
        else {
            for (int i=0; i<size/2; i++) {
                if ( str.charAt(i) != str.charAt(size-1-i) ) {
                    string = false;
                    break;
                }
            }
            if (string==false) {
                System.out.println(str+" is not a palindrome.");
            }
            else {
                System.out.println(str+" is a palindrome.");
            }
        }
    }
}

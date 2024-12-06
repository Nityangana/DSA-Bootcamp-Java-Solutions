// To calculate Fibonacci Series up to n numbers.

import java.util.ArrayList;
import java.util.Scanner;
public class Question7 {
    public static void main (String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        for (int i=2; i<n; i++) {
            int sum = fibonacci.get(i-1)+fibonacci.get(i-2);
            fibonacci.add(sum);
        }
        System.out.println(fibonacci);
    }
}

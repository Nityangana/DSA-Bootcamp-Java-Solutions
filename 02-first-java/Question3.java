// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Question3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter time in years: ");
        double time = input.nextDouble();
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();

        double SI = (principal * rate * time)/100;
        System.out.println("Simple Interest on "+principal+" is "+SI);
    }
}
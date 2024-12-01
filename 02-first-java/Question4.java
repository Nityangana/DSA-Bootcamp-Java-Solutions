// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;
public class Question4 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.print("Choose an operation between add, substract, multiply, divide: ");
        String op = input.next();
        System.out.println(op);

        if ( op.equals("add") ) {
            System.out.println("Sum of "+num1+ " and "+num2+" is "+num1+num2);
        }
        else if ( op.equals("substract") ) {
            System.out.println("Substraction of "+num1+ " and "+num2+" is "+(num1-num2));
        }
        else if ( op.equals("multiply") ) {
            System.out.println("Multiplication of "+num1+ " and "+num2+" is "+num1*num2);
        }
        else {
            System.out.println("Division of "+num1+ " and "+num2+" is "+num1/num2);
        }
    }
}

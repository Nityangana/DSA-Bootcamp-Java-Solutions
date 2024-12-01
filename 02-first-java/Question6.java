// Input currency in rupees and output in USD.
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter currency in Rupees: ");
        double inr = input.nextDouble();
        System.out.println("Rs"+inr+" is equal to $"+(inr*0.012));
    }
}

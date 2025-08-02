package controlStatements;
import java.util.Scanner;

public class PositiveNumber {
    // Check if a number is positive.
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if (a > 0)
            System.out.println(a + " is a positive number");
        else if (a == 0) 
            System.out.println(a + " is zero");
        else
            System.out.println(a + " is a negative number");
    }
}

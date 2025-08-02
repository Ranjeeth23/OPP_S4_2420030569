package controlStatements;
import java.util.Scanner;
public class MultipliccationTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print the multiplication table for a given number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		for(int i = 0;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+n*i);
		}
		sc.close();

	}
}

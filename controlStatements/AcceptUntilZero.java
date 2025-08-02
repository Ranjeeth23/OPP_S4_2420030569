package controlStatements;
import java.util.Scanner;
public class AcceptUntilZero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accept numbers until user enters 0.
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int n = sc.nextInt();
			if(n==0)break;
		}
		System.out.print("Exiting.....");
		sc.close();
	}

}


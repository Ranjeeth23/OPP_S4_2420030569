package operators;
import java.util.Scanner;
public class CampareTwoNumber {
//Compare two integers and display which one is greater or if they are equa
	public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc= new Scanner(System.in);
	int number1=sc.nextInt();
	int number2=sc.nextInt();
	if(number1>number2) {
		System.out.println(number1+ " is greater ");
	}
	else if(number1==number2) {
		System.out.println("Both are equal");
	}else {
		System.out.println(number2+" is greater");
	}
}
}
package operators;
import java.util.Scanner;
public class incrementdecrement {
	 public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    //6. Demonstrate increment and decrement operators on a variable7.
		    System.out.println("Enter a number: ");
		           Scanner sc=new Scanner(System.in);
		           int a=sc.nextInt();
		           int b=++a;
		           int c=--a;
		           System.out.println("Increment "+b);
		           System.out.println("Decrement "+c);
}
}
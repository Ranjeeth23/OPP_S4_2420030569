package operators;
import java.util.Scanner;
public class CompoundAssignment {
	 public static void main(String[] args) {
		  //Demonstrate compound assignment operators on a number.
		  Scanner sc = new Scanner(System.in);
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    a+=b;
		   System.out.println("sum "+a);
		   }
}

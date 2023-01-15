package assignment2;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int n1=in.nextInt();
		int n2=in.nextInt();
		int n3=in.nextInt();
		if(n1>n2&&n1>n3)
			System.out.println("First number is greatest");
		if(n2>n1&&n2>n3)
			System.out.println("Second number is greatest");
		if(n3>n2&&n3>n1)
			System.out.println("Third number is greatest");
	} 

}

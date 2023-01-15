package assignment2;
import java.util.Scanner;
public class q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==1)
			System.out.println("The number is PRIME");
		else
			System.out.println("The number is NOT PRIME");
	}

}

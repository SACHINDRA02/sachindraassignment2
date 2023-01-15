package assignment2;
import java.util.Scanner;
public class q17 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			int n, a= 0, b= 1;
			 System.out.print("Enter the number of terms");
			 n=in.nextInt();
		    System.out.println("Fibonacci Series till " + n + " terms:");
		    System.out.print(a+ ", ");
		    System.out.print(b+ ", ");
		    for (int i = 1; i <= n; ++i) {
		      int c= a+b;
		      System.out.print(c+ ", ");
		      a=b;
		      b=c;
		    }

		}

	}



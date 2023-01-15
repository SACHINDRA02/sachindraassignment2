package assignment2;
import java.util.Scanner;
public class q13 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 int a, b, hcf = 0;
		      Scanner in = new Scanner(System.in);
		      System.out.println("Enter first number :: ");
		      a = in.nextInt();
		      System.out.println("Enter second number :: ");
		      b = in.nextInt();

		      for(int i = 1; i <= a || i <= b; i++) {
		         if( a%i == 0 && b%i == 0 )
		         hcf = i;
		      }
		      System.out.println("HCF of given two numbers is ::"+hcf);

		}

	}

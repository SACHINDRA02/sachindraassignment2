package assignment2;
import java.util.Scanner;
public class q12 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n, evenSum = 0, oddSum = 0;
			Scanner in = new Scanner(System.in);
			
			System.out.print(" Please Enter any Number : ");
			n = in.nextInt();	
			
			for(int i=1;i<=n;i++)
			{
				if(i % 2 == 0)
				{
					evenSum = evenSum + i; 
				}
				else
				{
					oddSum = oddSum + i;
				}
				
			}
			System.out.println("\n The Sum of Even Numbers upto " + n + "  =  " + evenSum);
			System.out.println("\n The Sum of Odd Numbers upto " + n + "  =  " + oddSum);

		}

	}


package assignment2;
import java.util.Scanner;
public class q8 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n,c=1,b,i,j;
		    System.out.print("Input number of rows: ");
		    Scanner in = new Scanner(System.in);
				    n= in.nextInt();
		    for(i=0;i<n;i++)
		    {
		        for(b=1;b<=n-i;b++)
		        System.out.print(" ");
		        for(j=0;j<=i;j++)
		        {
		            if (j==0||i==0)
		                c=1;
		            else
		               c=c*(i-j+1)/j;
		            System.out.print(" "+c);
		        }
		        System.out.print("\n");
		    }

		}


		
	}



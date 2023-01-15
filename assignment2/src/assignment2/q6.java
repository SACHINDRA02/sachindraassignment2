package assignment2;
import java.util.Scanner;
public class q6 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			  int i,j,n;
			   System.out.print("Input number of rows : ");
			    n = in.nextInt();

			   for(i=1;i<=n;i++)
			   {
				for(j=1;j<=i;j++)
				  System.out.print(j);

			    System.out.println("");
			    }
			

		}
	}



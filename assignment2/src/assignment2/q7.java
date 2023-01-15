package assignment2;
import java.util.Scanner;
public class q7 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n;
			   System.out.print("Input number of rows : ");
			   Scanner in = new Scanner(System.in);
					    n = in.nextInt();
			   int num= 1;
			   for (int i = 1; i<= n; i++)
			    {
			   for (int j = 1; j <=i; j++)
			     {
			       System.out.print(num + " ");
			       num++;
			     }
			     System.out.println();
			    }

		}

	}


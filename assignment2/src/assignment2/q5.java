package assignment2;
import java.util.Scanner;
public class q5 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 int i,n;
			 Scanner in = new Scanner(System.in);
			   System.out.print("Input the number(Whose Table is to be calculated): ");
			   n = in.nextInt();
			
			   System.out.print("Input number of terms : ");
			 
					    int j = in.nextInt();

			   System.out.println ("\n");
			   for(i=1;i<=j;i++)
			  
			     System.out.println(n+" X "+i+" = " +n*i);
			   

		}

	}


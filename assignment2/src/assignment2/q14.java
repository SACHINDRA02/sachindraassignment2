package assignment2;
import java.util.Scanner;
public class q14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int P=0, N=0, Z=0, i;
	      int[] arr = new int[10];
	      Scanner in = new Scanner(System.in);
	      
	      System.out.print("Enter 10 Numbers: ");
	      for(i=0; i<10; i++)
	         arr[i] = in.nextInt();
	      
	      for(i=0; i<10; i++)
	      {
	         if(arr[i]<0)
	            N++;
	         else if(arr[i]>0)
	            P++;
	         else
	            Z++;
	      }
	      
	      System.out.println("\nTotal Positive Number: " +P);
	      System.out.println("Total Negative Number: " +N);
	      System.out.println("Total Zero: " +Z);

	}

}

}

package assignment2;
import java.util.Scanner;
public class q11 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner in = new Scanner(System.in);
			 int n=0;
		      int r=0;
		      System.out.println("Input the number: ");
		      n = in.nextInt();
		      while( n != 0 )
		      {
		    	  int j=n%10;
		          r = r*10 + j;
		          n = n/10;
		      }

		      System.out.println("Reverse of input number is: "+r);
		   }


}

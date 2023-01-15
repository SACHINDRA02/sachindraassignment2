package assignment2;
import java.util.Scanner;
public class q4 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
			 int y;
		      System.out.println("Enter an Year :: ");
		      Scanner sc = new Scanner(System.in);
		      y = sc.nextInt();

		      if (((y % 4 == 0) && (y % 100!= 0)) || (y%400 == 0))
		         System.out.println("Year is a leap year");
		      else
		         System.out.println("Year is not a leap year");

		}

	}



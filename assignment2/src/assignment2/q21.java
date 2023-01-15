package assignment2;
import java.util.Scanner;
public class q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n, d, sum = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		n = sc.nextInt();  
		while(n > 0)  
		{  
		   
		d = n % 10;  
		
		sum = sum + d;  
		  
		n = n / 10;  
		}  
		 
		System.out.println("Sum of Digits: "+sum);  
		}  
		

	}


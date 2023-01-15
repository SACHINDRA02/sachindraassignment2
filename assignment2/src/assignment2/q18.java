package assignment2;
import java.util.Scanner;
public class q18 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a,n;
		a=(int) (Math.random()*1000);
		System.out.println(a);
		System.out.println("Eneter a number");
		n=in.nextInt();
		if(n>a)
			System.out.println("Too High,Try again!");
		else if(n<a)
			System.out.println("Too Low,Try again!");
		else
			System.out.println("Congratulations nice guess");
		
	}
	

}

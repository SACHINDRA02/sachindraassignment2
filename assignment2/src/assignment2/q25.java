package assignment2;
import java.util.Scanner;
public class q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word");
		String str,str1="",str2;
		char ch;
		str=in.nextLine();
		str2=str;
		
		int l=str.length();
		for(int i=0;i<l;i++) {
			ch=str.charAt(i);
			str1=str1+ch;
		}
		if(str2.equals(str1)) {
			System.out.println("Palindrome Word");
		System.out.println(str1);}
		else {
			System.out.println("NOT aPalindrome Word");
		System.out.println(str1);}
			

	}

}

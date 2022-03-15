import java.util.Scanner;

public class PalindromeOfNumber {
	
	public static void main(String args[]) {
	
	       //Palindrome of a number
			int rem, revnum=0;
			System.out.println("Enter the number:");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			sc.close();
			int temp=num;
			while(num>0) {
				rem=num%10;
				revnum=revnum*10+rem;
				num/=10;	
			}
			if(revnum==temp) {
				System.out.println("The number is a Palindrome!");
			}
			else {
				System.out.println("The number is not a Palindrome!");
			}
}
}

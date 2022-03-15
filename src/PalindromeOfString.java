import java.util.Scanner;

public class PalindromeOfString {

	public static void main(String args[]) {
		
		//Palindrome of a string
		System.out.println("Enter the string:");
		Scanner sc1=new Scanner(System.in);
		String str=sc1.nextLine();
		sc1.close();
		String reverseStr="";
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr=reverseStr+str.charAt(i);
		}
		if((str.toLowerCase()).equals(reverseStr.toLowerCase())) {
		System.out.println("The string is a Palindrome!");
		}
		else {
			System.out.println("The string is not a Palindrome!");
		}
		
		
	}
}

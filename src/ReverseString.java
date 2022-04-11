import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		/*
		 * USING STRING BUFFER
		 */
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		sb=sb.reverse();
		System.out.println(sb);
		
		/*
		 * USING CHAR ARRAY TO REVERSE
		 */
		char[] arr=str.toCharArray();
		String revStr="";
		for(int i=arr.length-1; i>=0; i--) {
			revStr=revStr+arr[i];
		}
		System.out.println(revStr);
		
	}

}

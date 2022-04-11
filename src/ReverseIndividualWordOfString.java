import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseIndividualWordOfString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		/*
		 * USING STRING BUFFER
		 */
		String[] strArray=str.split(" ");
		String revWord="";
		for(String s:strArray) {
			StringBuffer sb= new StringBuffer();
			sb.append(s);
			sb.reverse();
			revWord+=sb+" "; 
		}
		System.out.println(revWord);
		
		/*
		 * NORMAL TECHNIQUE
		 */
		String[] arr=str.split(" ");
		String reverseWord=""; 
		for(int i=0; i<arr.length; i++) {
			String revStr="";
			for(int j=arr[i].length()-1; j>=0; j--) {
				revStr=revStr+arr[i].charAt(j);
				
			}
			//System.out.print(revStr+" ");
			reverseWord+=revStr+" ";
		}
		System.out.println(reverseWord);

		/*
		 * Bonus: Capitalizing the first letter of each word
		 */
		String caps=Arrays.stream(reverseWord.split(" "))
				.map(t->t.substring(0,1).toUpperCase()+t.substring(1))
				.collect(Collectors.joining(" "));
		System.out.println(caps);
		
		
	}

}

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Java program to make the first letter of a String capital
 */
public class CapitalizeFirstLetterOfEachWord {

	public static void main(String[] args) {
		
		/*
		 * For entering the string
		 */
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		/*
		 * Technique 1: USING STREAMS
		 */
		if (str == null || str.isEmpty()) {
	        System.out.println(str);
	    }

	     String result=Arrays.stream(str.split("\\s+"))
	            .map(t -> t.substring(0, 1).toUpperCase() + t.substring(1))
	            .collect(Collectors.joining(" "));
	     System.out.println(result);
	     
	     
		
		
		/*
		 * Technique 2: USING STRING BUFFER
		 */
		String[] arr = str.split(" ");
		StringBuffer sb = new StringBuffer();

		    for (int i = 0; i < arr.length; i++) {
		        sb.append(Character.toUpperCase(arr[i].charAt(0)))
		            .append(arr[i].substring(1)).append(" ");
		    }          
		    System.out.println(sb.toString().trim());
		
		
		/*
		 * Technique 3: USING CHAR ARRAY
		 */

		
		  // stores each characters to a char array char[] charArray =
		  char[] charArray=str.toCharArray(); 
		  boolean foundSpace = true;
		  
		  for(int i = 0; i < charArray.length; i++) {
		  
		  // if the array element is a letter 
			  if(Character.isLetter(charArray[i])) {
		  
		  // check space is present before the letter 
				  if(foundSpace) {
		  
		  // change the letter into uppercase 
          charArray[i] =Character.toUpperCase(charArray[i]); foundSpace = false; } }
		  
		  else { 
			  // if the new character is not character 
			  foundSpace = true; } }
		  
		  // convert the char array to the string 
	      str = String.valueOf(charArray);
		  System.out.println(str);
		 
	}

}

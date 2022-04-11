import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateCharacterCount {
	
	/*
	 * Given a string find out duplicate character and its count .
	 * Ex: i/p- ”sanskar”, o/p- a=2,s=2.
	 */

	public static void main(String[] args) {
		
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		/*
		 * // Step 1 IntStream intStream = str.chars();
		 * 
		 * // Step 2 Stream<Character> charsStream = intStream.mapToObj(ch -> (char)
		 * ch);
		 * 
		 * // Step 3 Map<Character, Long> output =
		 * charsStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		 * 
		 * System.out.println(output);
		 */
        
        /*
         * USING STREAMS
         */
        Map<Character, Long> output = str.chars().mapToObj(ch->(char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(output);
        
        
        /*
         * WITHOUT USING STREAMS
         */
        int count;
        for(int i = 0; i < str.length(); i++) {
          count = 1;
          //Take one char at a time
          char c = str.charAt(i);
          // don't count the spaces
          if(c == ' ') 
            continue;
          for(int j = i + 1; j < str.length(); j++) {
            if(c == str.charAt(j)) {
              count++;
              // remove the char so that it is not picked again
              // in another iteration
              str = str.substring(0, j) + str.substring(j+ 1);
            }
          }
          if(count > 1) {
            System.out.println(c + "="+ count);
          }
        }
	}

}

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

    /*  
	 * Given a string find out repeated word and its count .
	 * Ex: i/p- "sansaks an ana nan ana nan" o/p- sansaks : 1, ana : 2, nan : 2 ,an : 1
	 */

public class RepeatedWordCount {
public static void main(String[] args) {
		
		System.out.println("Enter the string:");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count;
		
		String[] strArray = str.split(" ");
		
		/*
		 * USING MAP & STREAMS
		 */
	    Map<String , Long> map =  Arrays.stream(strArray)
	        .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
	        map.forEach( (k, v) -> System.out.println(k + " : "+ v)        );
	        
	        
	        /*
	         * WITHOUT USING STREAMS
	         */
	        System.out.println("Duplicate words in a given string : ");     
	        for(int i = 0; i < strArray.length; i++) {    
	            count = 1;    
	            for(int j = i+1; j < strArray.length; j++) {    
	                if(strArray[i].equals(strArray[j])) {    
	                    count++;    
	                    //Set words[j] to 0 to avoid printing visited word    
	                    //strArray[j] = "0";    
	                }    
	            }    
	                
	            //Displays the duplicate word if count is greater than 1    
	            if(count > 1  && strArray[i] != "0")    
	                System.out.println(strArray[i]+":"+count);    
	        }
}
}

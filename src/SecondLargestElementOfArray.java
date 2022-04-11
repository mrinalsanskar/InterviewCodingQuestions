import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestElementOfArray {

	public static void main(String[] args) {
		
		Integer[] arr= {12,34,66,54,343,23,324};
		List<Integer> list= Arrays.asList(arr);
		
		/*
		 * USING STREAMS (1)
		 * 
		 * if 2 elements are not present, gives java.util.NoSuchElementException
		 */
		int secLarge=list.stream()
		.sorted(Collections.reverseOrder())
		.distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secLarge);
		
		
		/*
		 * USING STREAMS (2)
		 * 
		 * if 2 elements are not present, gives java.util.NoSuchElementException
		 */
		int n = list.size();
		int secLarge2=list.stream()
				.sorted()
				.collect(Collectors.toList())
				.get(n-2);  //index of nth element will be n-1, for sorted list, 2nd largest index will be n-2
				System.out.println(secLarge2);
		
				
		/*
		 * USING NORMAL ARRAY TRAVERSAL
		 */
				int i, first, second;
				int arr_size=arr.length;
				 
		        /* There should be atleast two elements */
		        if (arr_size < 2) {
		            System.out.print(" Invalid Input ");
		        }
		 
		        /*Integer.MIN_VALUE is a constant in the Integer class of java.lang package 
		        that specifies that stores the minimum possible value for any integer variable in Java. 
		        The actual value of this is:  -2^31 = -2147483648*/
		        first = second = Integer.MIN_VALUE;
		        
		        for (i = 0; i < arr_size; i++) {
		            /* If current element is greater than
		            first then update both first and second */
		            if (arr[i] > first) {
		                second = first;
		                first = arr[i];
		            }
		 
		            /* If arr[i] is in between first and
		               second then update second  */
		            else if (arr[i] > second && arr[i] < first)
		                second = arr[i];
		        }
		 
		        if (second == Integer.MIN_VALUE)
		            System.out.print("There is no second largest"
		                             + " element\n");
		        else
		            System.out.print("The second largest element"
		                             + " is " + second);
		    }
				
				
				
				
	}

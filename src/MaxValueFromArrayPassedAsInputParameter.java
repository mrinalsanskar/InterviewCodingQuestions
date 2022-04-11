import java.util.Scanner;

public class MaxValueFromArrayPassedAsInputParameter {

	public static int max(int[] maxxy) {
		int max=0;
		
		for(int i=0; i<maxxy.length; i++) {
			if(maxxy[i]>max) {
				max=maxxy[i];
			}
		}
		return max;
		
	}
	
	public static int min(int[] minni) {
		int min=minni[0];
		
		for(int i=0; i<minni.length; i++) {
			if(minni[i]<min) {
				min=minni[i];
			}
		}
		return min;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter values of array:");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Maximum value in array:"+max(arr));
		//max(arr); -> this won't work, no compile time error alsp, just prints nothing
		System.out.println("Minimum value in array:"+min(arr));
		//min(arr);
	}

}

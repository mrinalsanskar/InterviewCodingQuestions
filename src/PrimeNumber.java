import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int flag=0;
		
		/*
		 * CHECKING IF NUMBER IS PRIME OR NOT
		 */
		if(p==0||p==1){  
			   System.out.println(p+" is not prime number");      
			  }else{  
			   
		for(int i=2; i<=p/2; i++) {
			if(p%i==0) {
			System.out.println(p+" is not prime number");
				flag=1;
				break;
				//System.out.println("Prime");
			}
			}
		 if(flag==0)  { 
			 System.out.println(p+" is prime number");
			 }  
			  }
		
		
		/*
		 * TO FIND NTH PRIME NUMBER
		 */
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int num=1, count=0, i;  
		while (count < n)  
		{  
		num=num+1;  
		for (i = 2; i <= num; i++)  
		{   
		//determines the modulo and compare it with 0   
		if (num % i == 0)   
		{  
		//breaks the loop if the above condition returns true  
		break;  
		}  
		}  
		if (i == num)  
		{  
		//increments the count variable by 1 if the number is prime  
		count = count+1;  
		}  
		}  
		//prints the nth prime number  
		System.out.println("The " +n +"th prime number is: " + num);
		
	}

}

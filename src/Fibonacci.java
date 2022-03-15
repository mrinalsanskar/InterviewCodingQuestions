import java.util.Scanner;

public class Fibonacci {

	static int n1=0, n2=1, n3=0;
	
	static void fibonacci(int count) {
		if(count>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(" "+n3);
		fibonacci(count-1);
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Enter the count:");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		sc.close();
		System.out.println(n1+"\n"+n2);
		fibonacci(count-2);
	}
	
}

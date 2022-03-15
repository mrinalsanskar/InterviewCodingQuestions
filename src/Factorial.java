import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		sc.close(); //should be closed right here only, otherwise error
		for(int i=2; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of the number:" +fact);
	}
}


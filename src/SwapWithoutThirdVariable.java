import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x:");
		int x= sc.nextInt();
		System.out.println("Enter y:");
		int y= sc.nextInt();
		sc.close();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping:\n" + "x:" + x +"\n"+ "y:" + y);	
	}

}

import java.util.Scanner;

public class SwapUsingThirdVariable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x:");
		int x= sc.nextInt();
		System.out.println("Enter y:");
		int y= sc.nextInt();
		sc.close();
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping:\n" + "x:" + x +"\n"+ "y:" + y);
	}

}

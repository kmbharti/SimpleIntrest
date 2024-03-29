import java.util.*;
public class Function{
	public static int calculateSum(int a,int b)
	{
       int sum= a + b;
       return sum;
	}
public static void main(String rgs[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the any First number:");
	int i=sc.nextInt();
	System.out.println("Enter the any Second number:");
	int j=sc.nextInt();
	int sum= calculateSum(i,j);
	System.out.println("Sum of two numbers="+sum);
}
}

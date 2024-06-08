import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int i,fact=1,n;
		System.out.println("Enter the n=");
		n=Sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println("factorial of number="+fact);
		}
	}
}
import java.util.*;
class Odd
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		double a,b;
		System.out.println("Enter the a");
		a=Sc.nextInt();
		if(a%2 == 0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}
import java.util.*;
class Num
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n=Sc.nextInt();
		if(n>0)
		{
			System.out.println("positive number");
		}
		else if(n<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}
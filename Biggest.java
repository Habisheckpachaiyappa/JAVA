import java.util.*;
class Biggest
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int a,b,biggest;
		System.out.println("Enter the vale a");
		a=Sc.nextInt();
		System.out.println("Enter the vale b");
		b=Sc.nextInt();
		if(a>b)
		{
			System.out.println("a is biggest="+a);
		}
		else
		{
			System.out.println("b is biggest");
		}
	}
}

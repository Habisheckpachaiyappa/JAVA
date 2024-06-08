import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		int i,a=0,b=1,c;
		System.out.println(a+" "+b);
		for(i=0;i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
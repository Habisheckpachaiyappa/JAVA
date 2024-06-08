import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		int rem,n=1234,rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			System.out.println(rev);
		}
	}
}
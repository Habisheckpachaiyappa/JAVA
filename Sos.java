import java.util.*;
class Sos
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int i,sum=0,n;
		System.out.println("Enter the n=");
		n=Sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
			System.out.println("sum of series="+sum);
		}
	}
}
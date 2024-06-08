import java.util.*;
class Multiplicationtable
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int i,n,m;
		System.out.println("Enter the n value=");
		n=Sc.nextInt();
		System.out.println("Enter the m value=");
		m=Sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(i+"*"+m+"="+(i*m));
		}	
	}
}
import java.util.*;
class Area
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		double A,a,b,c,s;
		System.out.println("Enter the a=");
		a=Sc.nextInt();
		System.out.println("Enter the b=");
		b=Sc.nextInt();
		System.out.println("Enter the c=");
		c=Sc.nextInt();
		s=(a+b+c)/2;
		A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Heron's formula="+A);
	}
}
		
		
import java.util.*;
class Leapyear
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int year;
		System.out.println("Enter the year");
		year=Sc.nextInt();
		if(year%4 ==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}
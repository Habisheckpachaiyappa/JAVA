import java.util.*;
class Vote
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int age,diff;
		System.out.println("Enter the age");
		age=Sc.nextInt();
		if(age >= 18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			diff=18-age;
			System.out.println("Not eligible"+diff+"years");
		}
	}
}
import java.util.*;
class Reversenum
{
public static void main(String arg[])
{
int n,rem,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the num:");
n=sc.nextInt();
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println("reverse number:"+rev);
}
}
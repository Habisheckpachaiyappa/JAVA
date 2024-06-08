import java.util.*;
class mix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1,n2,s,m,su;
double r,d;
System.out.println("Enter the 1 num");
n1=sc.nextInt();
System.out.println("enter the 2 num");
n2=sc.nextInt();
s=n1+n2;
m=n1*n2;
su=n1-n2;
d=n1/n2;
r=n1%n2;
System.out.println("sum="+s+"\nmultiply="+m+"subtract="+su+"divide="+d+"remainder="+r);
}
}
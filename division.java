import java.util.*;
class division
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int n1,n2;
double q,r;
System.out.println("Enter the n1");
n1=Sc.nextInt();
System.out.println("enter the n2");
n2=Sc.nextInt();
q=n1/n2;
r=n1%n2;
System.out.println("quotient="+q+"remainder="+r);
}
}
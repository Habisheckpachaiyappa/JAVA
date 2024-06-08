import java.util.*;
class swap
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int n1,n2,swap;
System.out.println("Enter the n1");
n1=Sc.nextInt();
System.out.println("enter the n2");
n2=Sc.nextInt();
swap=n1;
n1=n2;
n2=swap;
System.out.println("swap="+n1+"s="+n2);
}
}
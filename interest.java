import java.util.*;
class interest
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
double p,t,r,si;
System.out.println("Enter the p");
p=Sc.nextInt();
System.out.println("Enter the t");
t=Sc.nextInt();
System.out.println("Enter the r");
r=Sc.nextInt();
si=(p*t*r)/100;
System.out.println("interest="+si);
}
}
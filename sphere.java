import java.util.*;
class sphere
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
double r,volume;
System.out.println("enter the radius");
r=Sc.nextInt();
volume=1.33*3.14*r*r*r;
System.out.println("volume of sphere="+volume);
}
}
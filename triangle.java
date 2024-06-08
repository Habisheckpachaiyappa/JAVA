import java.util.*;
class triangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int b,h;
double area;
System.out.println("Enter the base");
b=sc.nextInt();
System.out.println("enter the height");
h=sc.nextInt();
area=0.5*b*h;
System.out.println("area of triangle="+area);
}
}
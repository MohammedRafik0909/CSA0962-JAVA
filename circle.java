import java.util.*;
class circle{
public static void main(String args[])
{
int r;
double p=3.14;
Scanner c = new Scanner(System.in);
System.out.print("Enter the  radius R:");
r = c.nextInt();

double a = 2*p*r;
double cr = p*r*r;
System.out.println("THE area of circle is " + a);
System.out.println("The circumference of area is " + cr);

}
}
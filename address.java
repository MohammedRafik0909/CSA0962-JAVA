import java.util.*;
class address{
public static void main(String args[])
{
String n;
String f;
int D;
String ar;
Scanner na = new Scanner(System.in);
System.out.print("Enter Name:");
n = na.nextLine();
Scanner fa = new Scanner(System.in);
System.out.println("Enter Father Name:");
f = fa.nextLine();
Scanner Do = new Scanner(System.in);
System.out.println("Enter Door no:");
D = Do.nextInt();
Scanner ara = new Scanner(System.in);
System.out.print("Enter area name:");
ar = ara.nextLine();

System.out.println("       MY ADDRESS       ");
System.out.println("NAME   :" + n);
System.out.println("FATHER NAME   :" + f);
System.out.println("DOOR NO   :" + D);
System.out.println("AREA    :" + ar); 

}
}
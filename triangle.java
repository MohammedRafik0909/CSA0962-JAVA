import java.util.*;
class triangle{
public static void main(String args[]){
int s,a,b,c;
Scanner aa = new Scanner(System.in);
System.out.println("Enter S:");
s = aa.nextInt();
Scanner ba = new Scanner(System.in);
System.out.println("Enter A:");
a = ba.nextInt();
Scanner ac = new Scanner(System.in);
System.out.println("Enter B:");
b = ac.nextInt();
Scanner ad = new Scanner(System.in);
System.out.println("Enter C:");
c = ad.nextInt();

double tem = s*(s-a)*(s-b)*(s-c);
double area = Math.sqrt(tem);

System.out.println("AREA OF TRIANGLE IS " + area);



}
} 
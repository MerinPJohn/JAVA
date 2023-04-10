import java.util.Scanner;
public class evenodd
{
public static void main(String args[])
{
int a;
Scanner reader = new Scanner(System.in);
System.out.println("Enter a number:");
a=reader.nextInt();
if(a%2==0)
{
System.out.println("The number is even");
}
else
{
System.out.println("The number is odd");
}
}
}

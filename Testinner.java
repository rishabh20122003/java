import java.util.Scanner;
class Nest1
{
int num1;
Scanner sc=new Scanner (System.in);
void insert()
{
System.out.println("\n Enter an integer value:=");
num1=sc.nextInt();
}
}
class Nest2
{
int num2;
Nest n1;
Scanner sc=new Scanner(System.in);
Nest2(Nest1=x);
{
n1=x;
}
void getvalue()
{
n1.insert();
System.out.println("\n Enter a Integer value:=");
num2=sc.nextInt();
}
void compare()
{
if (n1.num1==this.num2)
{
System.out.println("\n Same");
}
else
{
System.out.println("\n Different");
}
}
}
class Testinner
{
public static void main(String []args)
{
Nest1 x=new Nest1();
Nest2 n2=new Nest2(x);
n2.getvalue();
n2.compare();
}
}

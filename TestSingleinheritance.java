import java.util.Scanner;
class Base
{
int num1;
Scanner sc=new Scanner (System.in);
void basevalue()
{
System.out.println("\n Enter Base value");
num1=sc.nextInt();
}
}
class Derived extends Base
{
int num2;
void derivedvalue()
{
basevalue();
System.out.println("\n Enter Derived value:=");
num2=sc.nextInt();
}
void addition()
{
int add;
add=num1+num2;
System.out.println("\n Base and Derived data addition :="+add);
}
}
class TestSingleinheritance
{
public static void main(String []args)
{

Derived d=new Derived();
        d.derivedvalue();
        d.addition();
}
}
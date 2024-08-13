import java.util.Scanner;
class Primary
{
int num1;
Scanner sc=new Scanner(System.in);
}
class Secondary extends Primary
{
int num2;
}
class Derived extends Secondary
{
void basevalue()
{
System.out.println("\n Enter a primary base value:=");
num1=sc.nextInt();
System.out.println("\n Enter a derived base value:=");
num2=sc.nextInt();
}
void compare()
{
if (num1==num2)
{
System.out.println("\n Both base values are same:=");
}
else
{
System.out.println("\n Both base values are different:=");
}
}
}
class TestMultilineinheritance
{
public static void main(String []args)
{
Derived d=new Derived();
        d.basevalue();
}
}


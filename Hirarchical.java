import java.util.Scanner;
class Base
{
int num1;
Scanner sc=new Scanner(System.in);
void insert()
{
System.out.println("\n Enter a Base Value");
num1 = sc.nextInt();
}
}
class Derived1 extends Base
{
int num2;
void insert()
{
super.insert();
System.out.println("\n Enter a Derived value");
num2 = sc.nextInt();
}
void plus()
{
int add;
add=num1+num2;
System.out.println("\n Addition of Base and Derived Data:="+add);
}
}
class Derived2 extends Base
{
int num2;
void getvalue()
{
System.out.println("\n Enter a Derived value:=");
num2 =  sc.nextInt();
}
void minus()
{
int sub;
sub = num1-num2;
System.out.println("\n Substraction of Base & Derived data:="+sub);
}
}
class Hirarchical
{
public static void main(String []args)
{
Derived1 d1=new Derived1();
Derived2 d2=new Derived2();
         d1.insert(); 
         d1.plus();
         d2.insert();
         d2.getvalue();
         d2.minus();
}
}
        
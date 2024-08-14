class Base
{
int num1;
Base(int x)
{
num1=x;
System.out.println("\n A base value:="+num1);
}
}
class Derived extends Base
{
int num2;
Derived (int x , int y)
{
super(x);
num2=y;
System.out.println("\n A derived value:="+num2);
}
}
class Singleemptyconstructorparameterised
{
public static void main(String []args)
{
Derived d1=new Derived(4,16);
}
} 
class Base
{
int num1;
Base()
{
num1=3;
System.out.println("\n A Base Value:="+num1);
}
}
class Derived extends Base
{
int num2;
Derived ()
{
num2=4;
System.out.println("\n A Derived Value:="+num2);
}
}
class SingleemptyconstructorNonparameterised
{
public static void main(String []args)
{
Derived d1=new Derived();
}
}
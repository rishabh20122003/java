class Summation
{
void addition()
{
System.out.println("\n I belong to summation family");
}
void addition (int num1)
{
int plus;
plus=num1+num1;
System.out.println("\n Addition of data:="+plus);
}
void addition(int num1,int num2)
{
int plus;
plus=num1+num2;
System.out.println("\n Addition of data:="+plus);
}
void addition(float num1,float num2)
{
float plus;
plus=num1+num2;
System.out.println("\n Addition of data:="+plus);
}
}
class Testfunoverload
{
public static void main(String []args)
{
Summation s=new Summation();
          s.addition();
          s.addition(2);
          s.addition(14,8);
          s.addition(2.3f,9.6f);
}
}

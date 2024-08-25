interface operation
{
static final int num1=5;
static final int num2=10;
}
class useinterface implements operation
{
int x=num1;
int y=num2;
void product()
{
int mul;
mul=x*y;
System.out.println("\n Product if interface data:="+mul);
}
void division()
{
int Quotient;
Quotient = num1/num2;
System.out.println("Quotient after dividing interface data:="+Quotient);
}
}
class Variableininterface
{
public static void main(String []args)
{
useinterface u=new useinterface();
             u.product();
             u.division();
}
}
class Instancedata
{
int num1=14;
int num2=2;
void minus()
{
num1=46; num2=24;
int sub;
sub=num1-num2;
System.out.println("\n substraction of data:="+sub);
}
public static void main (String []args)
{
Instancedata ID=new Instancedata ();
ID.minus();
}
}
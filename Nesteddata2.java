class Outler
{
int num1=5;
int x=15;
class Inner 
{
int y=20;
void addition()
{
int plus;
plus = x+y;
System.out.println("\n Addition of static data of Outler & Inner class:="+plus);
}
}
}
class Nesteddata2
{
public static void main(String []args)
{
Outler O=new Outler();
Outler.Inner I=O.new Inner();
 I.addition();
}
}
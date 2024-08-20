interface Mathsoperation
{
int calculate (int num1,int num2);
}
class Product implements Mathsoperation
{
public int calculate (int num1,int num2)
{
return num1*num2;
}
}
class Addition implements Mathsoperation
{
public int calculate (int num1,int num2)
{
int add;
add=num1+num2;
return add;
}
}
class Testtwoclassesinterface
{
public static void main(String []args)
{
Product P=new Product();
System.out.println("\n Product of data:="+P.calculate(15,4));
int plus;
Addition A=new Addition();
plus = A.calculate(105,115);
System.out.println("\n Addition of data:="+plus);
}
}
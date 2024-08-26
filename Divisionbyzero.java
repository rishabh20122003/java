class Divisionbyzero
{
public static void main(String []args)
{
int divisor=10;
int dividend=0;
int Quotient;
try
{
Quotient = divisor/dividend;
System.out.println("Quotient after division:="+Quotient);
}
catch (ArithmeticException ae)
{
System.out.println("\n Cannot divide by zero");
}
System.out.println("\n Happy Programming");
}
}


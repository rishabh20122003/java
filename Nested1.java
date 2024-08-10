class Outler
{
void ofun()
{
System.out.println("\n I am outler class function");
}
class Inner
{
void ifun()
{
System.out.println("\n I am inner class function");
}
}
}
class Nested1
{
public static void main(String []args)
{
Outler O = new Outler();
O.ofun();
Outler.Inner I = O.new Inner();
I.ifun();
}
}
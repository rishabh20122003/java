class One
{
void fun()
{
System.out.println("\n I belong to a class");
}
}
class Two
{
void fun()
{
System.out.println("\n I also belong to a class");
}
}
class Multiclass
{
public static void main (String []args)
{
One O= new One();
Two T= new Two();
    O.fun();
    T.fun();
}
}
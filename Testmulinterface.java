interface Mathsoperation
{
int calculate (int num1 , int num2);
}
interface Logicaloperation
{
boolean compare (String text1 , String text2);
}
class userinterface implements Mathsoperation,Logicaloperation
{
public int calculate (int num1 , int num2)
{
return num1-num2;
}
public boolean compare (String text1 , String text2)
{
if (text1.equals (text2))
return true;
else 
return false;
}
}
class Testmulinterface
{
public static void main (String []args)
{
userinterface u=new
userinterface();
System.out.println("Substraction:="+u.calculate(20,9));
System.out.println("Is data same:="+u.compare("blue","blue"));
}
}
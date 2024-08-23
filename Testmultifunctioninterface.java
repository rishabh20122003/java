interface operation
{
int calculate (int num1 ,int num2);
boolean compare (String text1 , String text2);
}
class userinterface implements operation
{
public void calculate (int num1 , int num2)
{
return num1/num2;
}
public boolean compare (String text1 , String text2){}
}
class Testmultifunctioninterface
{
public static void main (String []args)
{
userinterface u=new userinterface();
System.out.println("\n Quotient after division:="+u.calculate(64,16));
}
}

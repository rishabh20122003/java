class Commandline
{
public static void main (String []args)
{
int num1,num2,product;
String str1,str2;
str1 = args[0];
str2 = args[1];
num1 = Integer.parseInt(str1); 
num2 = Integer.parseInt(str2);
product = num1*num2;
System.out.println("\n Product of argument data:="+product);
}
}

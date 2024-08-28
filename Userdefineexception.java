import java.util.Scanner;
class AgeException extends Exception
{
AgeException()
{
System.out.println("\n Less than zero not allowed");
}
AgeException(String msg)
{
super(msg);
System.out.println("msg");
}
}
class Userdefineexception
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int age;
try
{
System.out.println("Enter the age of person:=");
age =sc.nextInt();
if(age<0)
throw new AgeException("Cant be a negative value:=");
else 
if(age>=0 && age<18)
System.out.println("\n A minor problem");
else
System.out.println("\n A major problem");
}
catch(AgeException ae)
{
System.out.println("An error messages:="+ae.getMessage());
}
}
}


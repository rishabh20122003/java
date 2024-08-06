import java.util.*;
interface client
{
void input();
void output();
}
class interface1 implements client
{
String name;
double salary;
public void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter your name");
name = sc.nextLine();
}
public void output()
{
System.out.println("Name: "+name);
//System.out.println("enter the code");
}
public static void main(String []args)
{
client C=new abc();
       C.input();
       C.output();
}
}


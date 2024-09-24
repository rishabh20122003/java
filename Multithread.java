class FirstThread extends Thread
{
public void run()
{
for(int i=1;i<16;i++)
{
System.out.println("\n First Thread Running");
}
}
}
class SecondThread extends Thread
{
public void run()
{
for(int j=1;j<11;j++)
{
System.out.println("\n Second Thread Running");
}
}
}
class ThirdThread extends Thread
{
public void run()
{
for(int k=1;k<21;k++)
{
System.out.println("\n Third Thread Running");
}
}
}
class Multithread
{
public static void main(String []args)
{
FirstThread FT=new FirstThread();
SecondThread ST=new SecondThread();
ThirdThread TT=new ThirdThread();
FT.start();
ST.start();
TT.start();
}
}


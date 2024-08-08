class student
{
String sname;
student (String name)
{
sname=name;
}
}
class Shallowcopy
{
public static void main(String []args)
{
student s1=new student("August");
System.out.println("Student Name:="+s1.sname);
student s= new student();
s=s1;
System.out.println("\n Student name:="+s.sname);
s.sname="June";
System.out.println("\n Student Name:="+s1.sname);
}
}

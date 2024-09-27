import java.io.*;
class Buffread
{
public static void main(String []args) throws IOException
{
int var=0;
char ch;
File F=new File("Buffer.txt");
FileReader FR=new FileReader(F);
BufferedReader BW=new BufferedReader(FR);
while(var!=-1)
{
var=BW.read();
ch=(char)var;
System.out.println(ch);
}
BW.close();
FR.close();
}
} 
import java.io.*;
class Buffwrite
{
public static void main(String []args) throws IOException
{
String text="I am being transfered through Buffer";
File F=new File("Buffer.txt");
FileWriter FW=new FileWriter(F);
BufferedWriter BW=new BufferedWriter(FW);
FW.write(text);
BW.close();
FW.close();
}
}
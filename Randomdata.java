import java.io.*;
class Randomdata
{
public static void main(String []args) throws IOException
{
RandomAccessFile RA=new RandomAccessFile("Rand.txt","rw");
RA.write('A');
RA.writeInt(69);
RA.writeDouble(96.244);
RA.seek(0);
System.out.println("\n A character value:="+(char)RA.read());
System.out.println("\n An Integer value:="+RA.readInt());
System.out.println("\n A Double value:="+RA.readDouble());
RA.seek(1);
System.out.println("\n An Integer value:="+RA.readInt());
RA.close();
}
}
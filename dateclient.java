import java.io.*;
 import java.net.*;
  class dateclient
{
public static void main(String args[]) {
Socket soc;

DataInputStream dis; String sdate;
PrintStream ps;
try
{
InetAddress ia=InetAddress.getLocalHost();
soc=new Socket(ia,8020);
dis=new DataInputStream(soc.getInputStream());
sdate=dis.readLine();
System.out.println("The data in the server is: "+sdate);
}
catch(IOException e)
{
System.out.println("The exception is: "+e);
}
}
}

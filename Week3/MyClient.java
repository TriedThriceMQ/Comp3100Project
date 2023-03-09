import java.io.*;
import java.net.*;
public class MyClient {
public static void main(String[] args) {
try{
Socket s=new Socket("localhost",5000);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
System.out.println("I said: HELLO");
dout.writeUTF("HELLO");
DataInputStream dis=new DataInputStream(s.getInputStream());
String str=(String)dis.readUTF();
System.out.println("message= "+str);
dout.flush();
System.out.println("I said: BYE");
dout.writeUTF("BYE");
dout.flush();
dout.close();
s.close();
}catch(Exception e){System.out.println(e);}
}
}

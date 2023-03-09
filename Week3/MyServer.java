import java.io.*;
import java.net.*;
public class MyServer {
public static void main(String[] args){
try{
ServerSocket ss=new ServerSocket(5000);
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
String str=(String)dis.readUTF();
System.out.println("message= "+str);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
System.out.println("I said: G'DAY");
dout.writeUTF("G'DAY");
dout.flush();
str=(String)dis.readUTF();
System.out.println("message= "+str);
ss.close();
}catch(Exception e){System.out.println(e);}
}
}

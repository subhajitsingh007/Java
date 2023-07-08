package Networking;
import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args) {
    try{
        Socket s = new Socket("localhost",6666);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Basic_JAVA.Hello Server");
        dout.flush();
        s.close();
    }
    catch(Exception  e){
        System.out.println(e);
    }

    }
}

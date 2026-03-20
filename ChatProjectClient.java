//Client 
import java.io.*;
import java.net.*;

public class ChatProjectClient
{
    public static void main(String ar[])throws Exception
    {


        
        Socket sobj= new Socket("localhost",5100);

        System.out.println("Client gets connected with server successfully\n");

         PrintStream pobj=new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1=new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2=new BufferedReader(new InputStreamReader(System.in));


        for(int i=0;i<50;i++)
        {
        System.out.println("Enter message for server");
        String str=bobj2.readLine();
        pobj.println(str);



        str=bobj1.readLine();
        System.out.println("Server says :"+str);
        }

    }
}
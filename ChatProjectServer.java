//Server
import java.io.*;
import java.net.*;

public class ChatProjectServer
{
    public static void main(String ar[])throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Server is waiting at port 5100");

        Socket sobj=ssobj.accept();
        System.out.println("Client request gets accepted successfully\n");

        PrintStream pobj=new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1=new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2=new BufferedReader(new InputStreamReader(System.in));





        for(int i=0;i<50;i++)
        {
        String str=bobj1.readLine();
        System.out.println("Client says: "+str);
        System.out.println("Enter message for client\n");
        str=bobj2.readLine();
        pobj.println(str);
        }
    }
}
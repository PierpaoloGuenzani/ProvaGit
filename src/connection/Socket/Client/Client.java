package connection.Socket.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client
{
    public static void main(String[] args) throws IOException
    {
        Socket s = new Socket("127.0.0.1", 25500);
        
        //Buffer read leggo 
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(br.readLine());
        
        //Scrittura ad un server
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("solo il client e sto inviando!!");
    }   
}

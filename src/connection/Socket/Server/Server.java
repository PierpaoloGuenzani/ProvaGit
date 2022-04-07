package connection.Socket.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket s = new ServerSocket(25500);
        System.out.println("Server pronto");
        Socket client = s.accept();
        System.out.println("Client si è connesso : "+client.getInetAddress());
        
        //Scrivo al client
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        out.println("ciao");
        
        //Lettura da un client
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        System.out.println(br.readLine());
    }
    
}

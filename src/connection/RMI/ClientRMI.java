package connection.RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI
{

    public static void main(String args[])
    {
     try {
            Registry registry = LocateRegistry.getRegistry(2200);
            RMIInterface stub = (RMIInterface) registry.lookup("Server");
            stub.faiOperazione();
            int response = stub.getN();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }   
    }
}

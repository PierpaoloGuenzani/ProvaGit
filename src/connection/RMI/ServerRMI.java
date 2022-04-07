package connection.RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerRMI implements RMIInterface
{

    static int n = 0;

    @Override
    public void faiOperazione() throws RemoteException
    {
        n++;
    }

    @Override
    public int getN() throws RemoteException
    {
        return n;
    }

    public static void main(String args[])
    {

        try
        {
            ServerRMI obj = new ServerRMI();
            RMIInterface stub = (RMIInterface) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.createRegistry(2200);
            registry.bind("Server", obj); //bind("RMIInterface", stub);

            System.err.println("Server ready");
        }
        catch(Exception e)
        {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

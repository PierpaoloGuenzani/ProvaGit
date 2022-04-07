package connection.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote
{
    public void faiOperazione() throws RemoteException;
    public int getN() throws RemoteException;
}

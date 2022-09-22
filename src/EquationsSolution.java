import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EquationsSolution extends Remote {
     double solve( int a, int b, int c) throws RemoteException;
}

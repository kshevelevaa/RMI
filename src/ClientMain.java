import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {
    public static final String UNIQUE_BINDING_NAME = "server.equation.solver";

    public static void main(String[] args) throws RemoteException, NotBoundException {
        final Registry registry = LocateRegistry.getRegistry(2732);
        EquationsSolution equationsSolution = (EquationsSolution) registry.lookup((UNIQUE_BINDING_NAME));
        double result = equationsSolution.solve(3,2,1);
        System.out.println(result);
    }
}

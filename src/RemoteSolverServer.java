import java.rmi.RemoteException;

public class RemoteSolverServer implements EquationsSolution{
    @Override
    public double solve(int a, int b, int c) throws RemoteException {
        int D = b*b-4*a*c;
        System.out.println(D);
        System.out.println("hfdbgjdsfhvbdsfhjbv");
        double result;
        if (D<0){
            System.out.println("нет действительных корней");
        } else if (D==0) {
            result = -b/(2*a);
            System.out.println("имеет единственный корень "+ result);
            return result;
        } else {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
            return x1+x2;
        }
        return  0;
    }
}

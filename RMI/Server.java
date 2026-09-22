import java.rmi.Naming;
public class Server {
    public static void main(string[]args){
        try{
            CalculatorImpl obj = new CalculatorImpl();
            Naming.rebind(name :"rmi://localhost/Calculator", obj);
            System.out.println (x : "RMI Server Started...");

        } 
        catch (Exception e) {
            system.out.println(e);
        }
    }
}
import java.rmi.Naming;
public class Client {
    public static void main(String[]args){
        try {
            Calculator obj = (Calculator) Naming.lookup(
                name: "rmi://localhost/Calculator");
            System.out.println("Addition ="
                + obj.add(a:10 ,b:20));

            System.out.println("Subtraction ="
                + obj.subtract(a:20 ,b:10));

        }
        catch (Exception e ){
            System.out.println(e);
        }
    }
}
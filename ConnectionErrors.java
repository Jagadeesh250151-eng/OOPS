
import java.net.*;

public class Program9 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);
            s.close();
        } catch (Exception e) {
            System.out.println("Unable to connect to the server.");
        }
    }
}

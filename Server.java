
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(5000)) {
            System.out.println("Server: Waiting...");

            while (true) {
                try (Socket s = ss.accept();
                     DataInputStream in = new DataInputStream(s.getInputStream());
                     DataOutputStream out = new DataOutputStream(s.getOutputStream())) {

                    System.out.println("Server: Client Connected");
                    String msg = in.readUTF();
                    System.out.println("Server: Received: " + msg);
                    out.writeUTF("Welcome Client");
                    out.flush();
                }
                catch (IOException e) {
                    System.out.println("Server: Communication Error");
                }
                System.out.println("Server: Connection Closed");
            }
        }
        catch (BindException e) {
            System.out.println("Port already in use");
        }
        catch (IOException e) {
            System.out.println("Server Error");
        }
    }
}

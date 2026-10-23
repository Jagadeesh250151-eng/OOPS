
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        String msg = args.length > 1 ? args[1] : "Hello Server";

        try (Socket s = new Socket(host, 5000);
             DataOutputStream out = new DataOutputStream(s.getOutputStream());
             DataInputStream in = new DataInputStream(s.getInputStream())) {

            System.out.println("Client: Connected Successfully");
            out.writeUTF(msg);
            out.flush();
            System.out.println("Client: " + msg);
            System.out.println("Client: Reply: " + in.readUTF());
        }
        catch (IOException e) {
            System.out.println("Unable to connect to the server.");
        }

        System.out.println("Client: Socket Closed");
    }
}

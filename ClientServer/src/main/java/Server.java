import java.net.Socket;
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();
        System.out.println("Server is gestart.");

//client verbinden
        System.out.println("Client connected");
//lezen wat de client stuurt
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("Client says: " + str);

        //bericht sturen
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        System.out.println("Ik ga zeggen dat het werkt!");
        pr.println("Als je dit kunt lezen, dan werkt het!");
        pr.flush();

    }
}
import java.net.Socket;
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException{
//verbinding maken met server via port 4999
        Socket s = new Socket("localhost", 4999);

//bericht sturen
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        System.out.println("Ik ga nu 'Hallo Server' zeggen!");
        pr.println("Hallo Server!");
        pr.flush();
//lezen wat de Server stuurt:
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("Server says: " + str);


    }
}

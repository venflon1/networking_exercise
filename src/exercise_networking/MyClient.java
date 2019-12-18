package exercise_networking;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) {
		try {
			InetAddress serverAddres = InetAddress.getLocalHost();
			Socket socketClient = new Socket(serverAddres, 7000);
			System.out.println("client1");
			
		    OutputStream os = socketClient.getOutputStream();
		    PrintWriter out = new PrintWriter(os);
		    
		    out.println("Ciao Serverinoooo");
		    out.println("ti saluto");
		    os.close();
		    out.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

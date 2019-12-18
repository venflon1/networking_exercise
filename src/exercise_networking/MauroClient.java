package exercise_networking;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MauroClient {
	public static void main(String[] args) {
		try {
			Socket socketClient = new Socket("192.168.178.26", 10000);
			System.out.println("client1");
			
		    ObjectOutputStream os= new ObjectOutputStream(socketClient.getOutputStream());
		   	os.writeObject(new String("Sciao Maurizioooooooooooooooo"));
	
		    os.close();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

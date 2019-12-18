package networking_exercise.chat;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientChat {
	public static void main(String[] args) {
		try {
			Socket socketClient = new Socket(InetAddress.getLocalHost(), 9090);
			System.out.println("client1");

			ObjectOutputStream os = new ObjectOutputStream(socketClient.getOutputStream());
			Message mess = new Message();
			mess.setUsername("roberto");
			mess.setTextMessage(new String("Messaggio del ****" +  System.nanoTime()));
			os.writeObject(mess);

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

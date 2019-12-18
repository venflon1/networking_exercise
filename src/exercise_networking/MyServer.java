package exercise_networking;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(7000);
			System.out.println("1" );
			Socket socketClient = serverSocket.accept();
			System.out.println("2" );
			InputStream is = socketClient.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println("il client mi ha inviato: " + line );
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}

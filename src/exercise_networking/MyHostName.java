package exercise_networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyHostName {
	
	public static void main(String[] args) {
		try {
			InetAddress addressLocal = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

package exercise_networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public class DNSLookup {
	public static void main(String...args) {
		if(args.length < 1) {
			System.out.println("You must specified the name site that you want know him ip");
			System.exit(1);
		}
		List<String> list = Arrays.asList(args);
		list.forEach((s)-> {
			try {
				System.out.println(InetAddress.getByName(s));
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}

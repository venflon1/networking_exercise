package exercise_networking;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Curl {
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("you must specified a URL");
			System.exit(1);
		}
		
		InputStream is = null;
		BufferedReader bfs = null;
		try {
			URL url = new URL("http://"+args[0]);
			URLConnection conn = url.openConnection();
			is = conn.getInputStream();
			bfs = new BufferedReader(new InputStreamReader(is));
			
			String line = null;
			while( (line = bfs.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(bfs != null)
				try {
					bfs.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}

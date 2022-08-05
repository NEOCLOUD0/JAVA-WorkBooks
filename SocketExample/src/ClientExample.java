import java.net.*;
import java.io.*;
import java.nio.charset.*;

public class ClientExample {

	public static void main(String[] args) {
		System.out.println("Input a string: ");
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		try {
			String userString = userInput.readLine();
			Socket connection = new Socket("127.0.0.1", 1236);
			InputStream input = connection.getInputStream();
			OutputStream output = connection.getOutputStream();
			
			output.write(userString.length());
			output.write(userString.getBytes());
			
			int n = input.read();
			byte[] data = new byte[n];
			input.read(data);
			
			String serverResponse = new String(data, StandardCharsets.UTF_8);
			System.out.println("User said: " + serverResponse);
			
			if(!connection.isClosed()) {
				connection.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}

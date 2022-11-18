
import java.net.*;
import java.io.*;
import java.nio.charset.*;


public class Server {

	public static void main(String[] args) {
		ServerSocket server = null;
		boolean shutdown = false;
		
		try {
			server = new ServerSocket(1236);
			System.out.println("Port bound. Accepting Connections");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
		while(!shutdown) {
			Socket client = null;
			InputStream input = null;
			OutputStream output = null;
			
			try {
				client = server.accept();
				input = client.getInputStream();
				output = client.getOutputStream();
				
				int n = input.read();
				byte[] data = new byte[n];
				input.read(data);
				
				
				String clientInput = new String(data, StandardCharsets.UTF_8);
				int userInput = Integer.parseInt(clientInput);
				clientInput.replace("\n", "");
				System.out.println("Client said " + clientInput);
				System.out.println("Fibonacci: " + fibonacci(userInput));
				//System.out.println(fibonacci(Integer.parseInt(clientInput)));
				
				String response = "Your input was (" + clientInput + ")";
				output.write(response.length());
				output.write(response.getBytes());
				
				client.close();
				if(clientInput.equalsIgnoreCase("shutdown")) {
					System.out.println("Shutting down...");
					shutdown = true;
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				continue;
			}
		}

	}
	
	//FIBONACCI using Dynamic Solution
	public static int fibonacci(int n) {
		int v1 = 0; int v2 = 1; int v3 = 0;
		for(int i = 2; i <= n; i++) {
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
		}
		return v3;
		
	}

}

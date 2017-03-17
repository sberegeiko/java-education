package core.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class Server10 {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(81);
		
		while(true) {
			System.out.println("Wait for TCP-connection ...");
			Socket socket = serverSocket.accept(); 
			// заставляем сервер ждать подключений и 
			// выводим сообщение когда кто-то связался с сервером
			System.out.println("Get one!");
			
			// Берем входной и выходной потоки сокета, 
			// теперь можем получать и отсылать данные клиенту. 
			try (InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream()) {				
				byte[] request = HTTPUtils.readRequestFully(is);
				System.out.println("--------------------");
				System.out.print(new String(request));
				System.out.println("--------------------");
				byte[] response = new Date().toString().getBytes();
				os.write(response);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				socket.close();				
			}			
		}
	}

}

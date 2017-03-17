package core.http.pool;

import core.http.HTTPUtils;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.Callable;


public class HttpHandler implements Callable<Void> {
	private final Socket socket;
		
	public HttpHandler(Socket socket) {
		this.socket = socket;
	}

	@Override
	public Void call() throws Exception {
		try (InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream()) {
			byte[] request = HTTPUtils.readRequestFully(is);
			System.out.println("--------------------");
			System.out.print(new String(request));
			System.out.println("--------------------");
			byte[] response = new Date().toString().getBytes();
			os.write(response);			
		} finally {
			socket.close();
		}		
		return null;
	}
}

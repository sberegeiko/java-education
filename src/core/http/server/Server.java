package core.http.server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.spi.HttpServerProvider;

import sun.net.httpserver.*;
public class Server {

	public static void main(String[] args) throws IOException {
		final int backlog = 64;
		final InetSocketAddress serverAddress = new InetSocketAddress(81);
		HttpServerProvider provider = DefaultHttpServerProvider.provider();
		HttpServer server = provider.createHttpServer(serverAddress, backlog);
		server.setExecutor(Executors.newCachedThreadPool());
		
		HttpContext baseContext = server.createContext("/");
		baseContext.setHandler(new HttpHandler() {
			
			@Override
			public void handle(HttpExchange exchange) throws IOException {
				String protocol = exchange.getProtocol();
				String requestMethod = exchange.getRequestMethod();
				URI requestURI = exchange.getRequestURI();
				Headers requestHeaders = exchange.getRequestHeaders();
				String htmlPage = createResponsePage(protocol, requestMethod, requestURI, requestHeaders);
				Headers responseHeaders = exchange.getResponseHeaders();
				responseHeaders.add("X - My header", "1");
				responseHeaders.add("X - My header", "2");
				responseHeaders.add("X - My header", "3");
				exchange.sendResponseHeaders(200, htmlPage.length());
				
				OutputStream os = exchange.getResponseBody();
				os.write(htmlPage.getBytes(StandardCharsets.US_ASCII));
				os.close();
			}
		});		
		server.start();
	}

	private static String createResponsePage(String protocol, String requestMethod, URI requestURI,
			Headers requestHeaders) {
		String htmlPage = "<html><body>";
		htmlPage += "<br>requestMethod: " + requestMethod + "</br>";
		htmlPage += "<br>requestURI: " + requestURI + "</br>";
		htmlPage += "<br>protocol: " + protocol + "</br>";
	
		for(Map.Entry<String, List<String>> header : requestHeaders.entrySet()) {			
			String key = header.getKey();
			List<String> values = header.getValue();
			htmlPage += "<br>" + key + ": ";
			for (String value : values) {
				htmlPage += value + ", ";
			}
			htmlPage += "<br>";
		}		
		
		htmlPage += "<br>requestMethod: " + requestMethod + "</br>";
		return htmlPage;
	}
}

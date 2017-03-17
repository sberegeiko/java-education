package core.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class App01 {
	public static void main(String[] args) throws IOException {
		InputStream src = new URL("http://google.ru").openStream();
//		OutputStream dst = new FileOutputStream("C:/Users/Think/IdeaProjects/java-education/google.txt");
		copy(src, System.out);
	}
	
	public static void copy(InputStream src, OutputStream dst) throws IOException {
		byte[] buff = new byte[64 * 1024];
		while(true) {
			int count = src.read(buff);
			if(count != -1) {
				dst.write(buff, 0, count);
			} else {
				return;
			}
		}
	}
}

package core.io.stream;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.zip.GZIPOutputStream;

public class App04 {

	public static void main(String[] args) throws IOException {
		String str = "Hello!";
		
		System.out.println(str);
		OutputStream dst = new FileOutputStream("C:/Users/Think/IdeaProjects/java-education/tmp.txt");
		Writer writer = new OutputStreamWriter(dst, "UTF-8");
		writer.write(str);
		writer.flush();
		writer.close();
	}
}

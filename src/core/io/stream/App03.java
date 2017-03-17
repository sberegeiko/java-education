package core.io.stream;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class App03 {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream buff = new ByteArrayOutputStream();
		OutputStream dst = new BufferedOutputStream(buff, 8 * 1024);
		dst = new GZIPOutputStream(dst);
		DataOutput out = new DataOutputStream(dst);
		
		for(int i = 0; i < 10_000_000; i++) {
			out.writeDouble(i % 2 == 0 ? 0.5 : 1.5);
		}
		dst.flush();
		dst.close();
		byte[] rawData = buff.toByteArray();
		System.out.println(rawData.length);
	}
}

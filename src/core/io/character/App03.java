package core.io.character;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class App03 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "ｮ";
		System.out.println(str.charAt(0));
		System.out.println((int)str.charAt(0));
		System.out.println(Arrays.toString(str.getBytes("UTF-8")));
		System.out.println(Arrays.toString(str.getBytes("UTF-16BE")));
		System.out.println(Arrays.toString(str.getBytes("UTF-32")));
		System.out.println(Arrays.toString(str.getBytes("KOI8")));
		System.out.println(new String(str.getBytes("KOI8"), "KOI8"));
	}
}

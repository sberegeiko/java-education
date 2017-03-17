package core.io.character;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class App00 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		char x = 0xFF6E;
		String str = "ｮ";
		int y = 0;
		System.out.println(x);
		System.out.println(str);
		System.out.println(y);

		char[] c = Character.toChars(150_000);
			
		System.out.println(c.length);
		System.out.println(c);
		System.out.println(c[0]);
		System.out.println(c[1]);
		
		byte [] bytes = {9, 71, -127};
		System.out.println(Arrays.toString(new String(bytes, "UTF-8").toCharArray()));
		System.out.println(Arrays.toString(new String(bytes, "UTF-16").toCharArray()));
		System.out.println(Arrays.toString(new String(bytes, "cp1251").toCharArray()));
	}
}

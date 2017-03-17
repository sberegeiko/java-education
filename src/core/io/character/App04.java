package core.io.character;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class App04 {
	public static void main(String[] args) throws Exception {
		byte[] bytes = "AA".getBytes("UTF-8");
		System.out.println(Arrays.toString(bytes));
		String str = new String(bytes, "UTF-8");
		System.out.println(str);

		Map<String, Charset> allCharsets = Charset.availableCharsets();
		Set<String> charsetNames = allCharsets.keySet();
		System.out.println(charsetNames);
		System.out.println(charsetNames.size());
	}
}

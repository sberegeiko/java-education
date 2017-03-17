package core.io.character;

import java.util.Arrays;

public class App01 {
	public static void main(String[] args) {
		testCodePoint(65);
		testCodePoint(10_001);
		testCodePoint(50_000);
		testCodePoint(165_536);
	}

	private static void testCodePoint(int codePoint) {
		char[] charArray = Character.toChars(codePoint);
		System.out.println("char[]: " + Arrays.toString(charArray));
		String str = new String(charArray);
		System.out.println("String: " + str);		
		System.out.println("String.lengh: " + str.length());		
		System.out.println("String.codePointCount: " + str.codePointCount(0, str.length()));		
		System.out.println();
	}
}

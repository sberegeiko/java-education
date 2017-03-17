package core.procedural.recursia;

public class Recursia1 {

	public static void main(String[] args) {
		f(1);
	}

	private static void f(int arg) {
		
		if(arg < 7) {
			f(2 * arg);
		}
		System.out.print(" " + arg);
	}
	
	

}

package core.multithreading;

public class App00 {
	public static void main(String[] args) {
		Thread thread0 = new Thread();
		Thread thread1 = new Thread("name-1");
		Thread thread2 = new Thread("name-2");
		Thread thread3 = new Thread("name-3");
		
		System.out.println(thread0.toString());
		System.out.println(thread1.toString());
		System.out.println(thread2.toString());
		System.out.println(thread3.toString());
		
		System.out.println(thread0.getId());
		System.out.println(thread1.getId());
		System.out.println(thread2.getId());
		System.out.println(thread3.getId());
	}
}

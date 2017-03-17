package core.multithreading;

public class App02 {
	public static void main(String[] args) {
		System.out.println("main(): " + Thread.currentThread().getName());
		
		Thread t0 = new Thread(new Runnable(){
			public void run(){
				System.out.println("run(): " + Thread.currentThread().getName());
			}
		});
		
		t0.start();
	}
}

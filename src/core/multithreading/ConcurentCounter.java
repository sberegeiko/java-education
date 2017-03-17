package core.multithreading;

public class ConcurentCounter {
	public static final int N = 100_000_000;
	public static int counter;
	
	public static synchronized void inc() {
		counter++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t0 = new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < N; i++) {
					inc();
				}
			}
		});
		
		t0.start();
		
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < N; i++) {
					inc();
				}
			}
		});
		
		t1.start();
		
		t0.join();
		t1.join();
		
		System.out.println(counter);
	}
}

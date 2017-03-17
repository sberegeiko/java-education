package core.multithreading;

public class App04 {
	public static void main(String[] args) throws InterruptedException {
		Thread newThread = new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					sillyWork();
					System.out.println("Hello!");
				}
			}
		});
		
		newThread.start();
		
		for (int i = 0; i < 3; i++) {
			sillyWork();
			System.out.println("Bye!");			
		}
		newThread.join();
		System.out.println("That's ALL");
	}

	private static void sillyWork() {
		double d = 2.0;
		for (int i = 0; i < 5_000_000; i++) {
			d = Math.sin(d);
		}
	}
}

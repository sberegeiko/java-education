package core.multithreading;

public class App01 {
	static volatile boolean in0 = false;
	static volatile boolean in1 = false;
	
	public static void main(String[] args) {
		new Thread(new Runnable(){
			public void run(){
				while(true) {
					in0 = true;
					if(!in1) {
						System.out.println(0);
						System.out.println(0);
					}
					in0 = false;
				}
			}
		}).start();
		
		new Thread(new Runnable(){
			public void run(){
				while(true) {
					in1 = true;
					if(!in0) {
						System.out.println(1);
						System.out.println(1);						
					}
					in1 = false;
				}
			}
		}).start();
	}
}

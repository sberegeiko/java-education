package core.multithreading.monitor;

public class ProducerConsumerEx2 {
	public static void main(String[] args) {
		SingleElementBuffer buffer = new SingleElementBuffer();
		new Thread(new Producer(1, 100, buffer)).start();
		new Thread(new Producer(100, 500, buffer)).start();
		new Thread(new Producer(1000, 700, buffer)).start();
		
		new Thread(new Consumer(buffer, 1)).start();
	 	new Thread(new Consumer(buffer, 2)).start();

	}

}

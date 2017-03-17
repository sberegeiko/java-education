package core.multithreading.monitor;

public class ProducerConsumerEx1 {
	public static void main(String[] args) {
		SingleElementBuffer buffer = new SingleElementBuffer();
		new Thread(new Producer(1, 100, buffer)).start();
		new Thread(new Consumer(buffer, 1)).start();
	}
}

//package mod13;
import java.util.SyncStack;

public class Consumer implements Runnable {
	private SyncStack theStack;
	private int num;
	private static int counter = 1;

	public Consumer (SyncStack s) {
		theStack = s;
		num = counter++;
	}

	public void run() {
		char c;
		for (int i = 0; i < 200; i++) {
			c = theStack.pop();
			System.out.println("Consumer" + num + ":" + c);
			try {
				Thread.sleep((int)(Math.random() * 300));
			} catch (InterruptedException e) {
			// ignore it
			}
		}
	}

	public synchronized char pop() {
		char c;
		while (buffer.size() == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
			// ignore it...
			}
		}
		c = buffer.remove(buffer.size()-1);
		return c;
	}

	public synchronized void push(char c) {
		this.notify();
		buffer.add(c);
	}
}
public class ThreadTester {
	public static void main(String args[]) {
		HelloRunner r = new HelloRunner();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
}

class HelloRunner implements Runnable {
	int i;
	public void run() {
		i = 0;
		while (true) {
			System.out.println("Hello " + i++);
			if ( i == 50 ) {
				break;
			}
		}
	}
}
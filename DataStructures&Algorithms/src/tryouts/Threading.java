package tryouts;

class A{
	int count = 0;
	public void counter() {
		count++;
	}
}

public class Threading {
	public static void main(String[] args) throws InterruptedException {
		A a1 = new A();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					a1.counter();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					a1.counter();
				}
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(a1.count);
	}

}

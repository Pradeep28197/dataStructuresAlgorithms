package threads;

class UsingRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello Runnanle threads");// TODO Auto-generated method stub
		
	}
	
}

public class RunnableInterface {
	public static void main(String[] args) {
		UsingRunnable u1 = new UsingRunnable();
		UsingRunnable u2 = new UsingRunnable();
		UsingRunnable u3 = new UsingRunnable();
		UsingRunnable u4 = new UsingRunnable();
		UsingRunnable u5 = new UsingRunnable();
		Thread t1 = new Thread(u1);
		Thread t2 = new Thread(u2);
		Thread t3 = new Thread(u3);
		Thread t4 = new Thread(u4);
		Thread t5 = new Thread(u5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}

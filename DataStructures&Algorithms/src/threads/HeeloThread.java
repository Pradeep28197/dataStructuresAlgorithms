package threads;

class MyThread extends Thread{
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	
	}
	
public class HeeloThread {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("Pradeep");
		MyThread t2 = new MyThread();
		t2.setName("Arthika");
		MyThread t3 = new MyThread();
		t3.setName("Mani");
		MyThread t4 = new MyThread();
		t4.setName("Raji");
		MyThread t5 = new MyThread();
		t5.setName("Geetha");
		try {
		
		t1.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(1);
		t4.setPriority(7);
		t5.setPriority(3);
//		t1.getName();
		t1.start();
		t2.start();
		
//		t2.getName();
		t3.start();
		
//		t3.getName();
		t4.start();
		
//		t4.getName();
		t5.start();
		
//		t5.getName();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

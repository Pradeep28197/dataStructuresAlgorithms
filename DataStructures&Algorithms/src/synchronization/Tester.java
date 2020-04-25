package synchronization;

public class Tester {
	public static void main(String[] args) {
		
	

	    DataContainer d = new DataContainer();

	    Producer p3 = new Producer(d, 0);

	    Consumer c1 = new Consumer(d, 1);

	    p3.start();

	    c1.start();
	}

	  }



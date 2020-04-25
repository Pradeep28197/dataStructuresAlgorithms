package tryouts;

public class StringBuilderStringBuffer {
	public static void main(String[] args) {
		int N = 999999999;
		long t;
		t = System.currentTimeMillis();
		StringBuilder sbl = new StringBuilder();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<N;i++) {
			sbl.append("");
		}
		System.out.println(System.currentTimeMillis() - t);
		t = System.currentTimeMillis();
		for(int i=0;i<N;i++) {
			sb.append("");
		}
		System.out.println(System.currentTimeMillis() -t);

		
	}

}

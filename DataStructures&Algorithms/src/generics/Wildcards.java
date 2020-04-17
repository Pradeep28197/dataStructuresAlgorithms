package generics;

public class Wildcards<E extends String> {
	
		private E e;
		public Wildcards(E e) {
			this.e = e;
		}
		public void showObjectType() {
			System.out.println(e.getClass().getName());
		}
		
		public static void main(String[] args) {
			Wildcards<String> genClass = new Wildcards<String>("3");
			genClass.showObjectType();

		}


}

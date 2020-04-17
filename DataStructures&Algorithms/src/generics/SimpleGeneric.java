package generics;

public class SimpleGeneric<E> {
	private E e;
	public SimpleGeneric(E e) {
		this.e = e;
	}
	public void showObjectType() {
		System.out.println(e.getClass().getName());
	}
	
	public static void main(String[] args) {
		SimpleGeneric<Integer> genClass = new SimpleGeneric<Integer>(3);
		genClass.showObjectType();

	}
}

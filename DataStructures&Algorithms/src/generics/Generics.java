package generics;

public class Generics {
	
	public <E> void printArray(E[] list){
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
	}// define printArray method
	
		public static void main(String[] args) {
	
			Integer[] arrInteger = { 10, 20, 30, 40, 50, 60 };
			Character[] arrChar = { 'I', 'N', 'F', 'O', 'S', 'Y', 'S' };
			Double[] arrDouble = { 100.1, 200.1, 300.1, 400.1, 500.1, 600.1 };
			Generics tg = new Generics();
			tg.printArray(arrInteger);
			tg.printArray(arrChar);
			tg.printArray(arrDouble);
	
		}
	
}

package tryouts;

public class Tryout2 {
		public int cube(int n) {
			return n * n * n;
		}
		public static void main(String[] args) {
			try {
			Tryout2 tc = new Tryout2();
			int num = Integer.parseInt(args[0]);
			System.out.println(tc.cube(num));
			}
			catch(NumberFormatException ex){
				System.out.println(ex.getMessage());
				
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println(ex.getMessage());
			}
		}
}

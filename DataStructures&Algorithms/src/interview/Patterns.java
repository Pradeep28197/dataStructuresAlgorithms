package interview;

public class Patterns {
	
	public static void main(String[] args) {
		/*First split the entire rows and cols into 4 parts
		 6 6 6|6 6 6
		 6 5 5|5 5 6
		 6 5 4|4 5 6
		 - - -|- - -
		 6 5 4|4 5 6
		 6 5 5|5 5 6
		 6 6 6|6 6 6
		 
		 ---->then for the first part update the min of two values btwn
		 i-0 && j-0 then subtract from n value
		 We here simply subtract the rows or cols value from the initial stage
		 
		 ----> same method for second part here we take the diff btwn 
		 i-0 && (n-1)-j then subtract from n value
		 We here simply subtract the rows and cols value, calculating how far it is inside the boundary
		 
		 ----> Update the diff btwn 
		 j-0 && (n-1)-i then subtract from n value
		 
		 ----> This is crucial update the diff btwn 
		 (n-1)-i && (n-1)-j then subtract from n value 
		 */
		int n = 4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i <= (n-1)/2 && j <= (n-1)/2) {
					System.out.print((i-0)<(j-0)?n-i:n-j);
				}
				else if(i <= (n-1)/2 && j > (n-1)/2)
				{
					System.out.print((i-0)<(n-1-j)?n-i:n-((n-1)-j));
				}
				else if(i > (n-1)/2 && j <= (n-1)/2)
				{
					System.out.print((j-0)<(n-1-i)?n-j:n-((n-1)-i));
				}
				else if(i > (n-1)/2 && j > (n-1)/2)
				{
					System.out.print((n-1-i)<(n-1-j)?n-((n-1)-i):n-((n-1)-j));
				}
			}System.out.print("\n");
		}
		
	}

}

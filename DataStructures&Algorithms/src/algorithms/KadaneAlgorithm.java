package algorithms;

public class KadaneAlgorithm {
	public static int max(int[] arr) {
		int max_so_far = 0, max_here = 0;
		
		for(int i=0;i<arr.length;i++){
			max_here = max_here+arr[i];
			if(max_here<0)max_here = 0;
			if(max_so_far < max_here) max_so_far = max_here;
			
		}
		return max_so_far;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {0,-1,-2,-3,-4,-5,-6,-7,-8,-9};
		System.out.println("Maximum positive sum continously "+max(arr));
		
	}

}

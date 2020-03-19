package arrangementRearrangement;

public class MaxSumAllRotationNaive {
	public static int maxSum(int[] arr, int n) {
		int minVal = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int currVal = 0;
			for(int j=0;j<n;j++) {
				int index = (i+j)%n;
				currVal += j * arr[index];
			}
			if(currVal > minVal) {
				minVal = currVal;
				//maxVal = currVal;
			}
		}
		return minVal;	
	}
	
	public static void main(String[] args) {
		int [] arr = {8,3,1,2};
		System.out.println(maxSum(arr, arr.length));
		//dispArr(arr, arr.length);
	}

}

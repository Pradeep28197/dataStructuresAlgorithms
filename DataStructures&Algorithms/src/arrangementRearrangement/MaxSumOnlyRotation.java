package arrangementRearrangement;

public class MaxSumOnlyRotation {
	
	public static int maxSum(int[] arr, int n) {
		int currVal = 0, maxVal;
		int arrSum = 0;
		for(int i=0;i<n;i++) {
			arrSum += arr[i];
			currVal = currVal + (i*arr[i]);
		}
		maxVal = currVal;
		for(int j=1;j<n;j++) {
			currVal = currVal + arrSum - (n*arr[n-j]);
			if(currVal > maxVal) {
				maxVal = currVal;
			}
		}
		return maxVal;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,20,2,10};
		System.out.println(maxSum(arr,arr.length));
	}

}

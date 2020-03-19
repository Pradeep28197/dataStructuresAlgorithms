package binarySearch;
//This method works only if array has distinct elements


public class SmallestMissingNumber {
	public int smallestMissing(int[] arr, int low, int high) {
		if(low > high) {
			return high+1;
		}
		if(low != arr[low]) {
			return low;
		}
		int mid = (low+high)/2;
		if(arr[mid] == mid) {
			return smallestMissing(arr, mid+1, high);
		}return smallestMissing(arr, low, mid);
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		SmallestMissingNumber s1 = new SmallestMissingNumber();
		System.out.println(s1.smallestMissing(arr, 0,arr.length-1));	
	}

}

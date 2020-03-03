package rotationArray;

public class MinimumElementInSortedArray {
	
	public static int minInSortedArray(int[] arr,int low,int high) {
		//if(low>high) return arr[0];
		
		if(low == high) return arr[low];
		
		int mid = (low+high)/2;
		
		if(mid < high && arr[mid] > arr[mid+1]) {
			return arr[mid+1];
		}
		
		if(mid > low && arr[mid] < arr[mid-1]) {
			return arr[mid];
		}
		
		if(arr[high] > arr[mid]) {
			return minInSortedArray(arr, low, mid-1);
		}
		return minInSortedArray(arr, mid+1, high);
	}
	
	
	public static void main(String[] args) {
		int arr[] = {11,1,1,1,1,1,1};
		System.out.println("Minimum element in the Array is "+minInSortedArray(arr, 0, arr.length-1));
		
	}

}

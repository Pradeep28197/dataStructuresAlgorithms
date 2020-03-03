package binarySearch;

public class PivotedBinarySearch {
	
	public static int pivotedBinarySearch(int[] arr,int low, int high, int key ) {
		//int mid = (low+high)/2;
		int pivot = findPivot(arr, low, high);
		if(pivot == -1) return -1;
		if(arr[pivot] == key) return pivot;
		if(arr[low] <= key) {
			return binarySearch(arr, low, pivot-1, key);
		}
		return binarySearch(arr, pivot+1, high, key);
		
	}
	public static int binarySearch(int[] arr,int low, int high, int key) {
		if(low>high) return -1;
		int mid = (low+high)/2;
		//System.out.println(low+""+mid+""+high);
		if(arr[mid] == key) {
			return mid;
		}
		if(key < arr[mid]) {
			return binarySearch(arr, low, mid-1, key);
		}
		return binarySearch(arr, mid+1, high, key);
	}
	
	public static int findPivot(int[] arr,int low, int high) {
		if(low > high)return -1;
		
		if(low == high) return low;
		
		int mid = (low+high)/2;
		//System.out.println(low+""+mid+""+high);
		if(arr[mid] > arr[mid+1]) {
			return mid;
		}
		if(arr[mid] < arr[mid-1]) {
			return mid-1;
		}
		if(arr[low] >= arr[mid]) {
			return findPivot(arr, low, mid-1);
		}
		return findPivot(arr, mid+1, high);
		
	}
	
	public static void main(String[] args) {
		int arr[] = {3,4,5,1,2};
		int key = 8;
		//System.out.println(binarySearch(arr, 0, 4, key));
		System.out.println(key+" is in index "+pivotedBinarySearch(arr,0,4,key));
	}

}

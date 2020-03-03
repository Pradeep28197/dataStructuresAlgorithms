package binarySearch;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int low, int high, int key) {
		if(high<low) {
			return -1;
		}
		int mid = (low+high)/2;
		System.out.println(mid);
		if(key == arr[mid]) {
			return mid;
		}
		if(key < arr[mid]) {
			return binarySearch(arr, low, mid-1, key);
		}
		return binarySearch(arr, mid+1, high, key);
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int key = 7;
		int index = binarySearch(arr, 0,arr.length-1,key);
		System.out.print(key +" present at "+(index+1));
		
	}

}

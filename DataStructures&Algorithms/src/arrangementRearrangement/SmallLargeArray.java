package arrangementRearrangement;

import java.util.Arrays;

public class SmallLargeArray {
	
	public static void smallLargeArray(int[] arr, int n) {
		Arrays.sort(arr);
		
		int[] tempArray = new int[n];
		
		int arrayIndex = 0;
		
		for(int i=0, j = n-1; i<=n/2 && j>=n/2; i++,j--) {
			System.out.println(i +" "+j);
			if(arrayIndex < n) {
				tempArray[arrayIndex] = arr[i];
				arrayIndex++;
			}
			if(arrayIndex < n) {
				tempArray[arrayIndex] = arr[j];
				arrayIndex++;
			}
		}
		for( int i=0;i<n;i++) {
			arr[i] = tempArray[i];
		}
	}
	
	public static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = { 5,4,3,6,7,8,2,1};
		smallLargeArray(arr, arr.length);
		printArray(arr, arr.length);
		
	}

}

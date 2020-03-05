package sortingAlgo;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr,int n) {
		int i,j,t;
		boolean swapped;
		for(i=0;i<n;i++) {
			swapped = false;
			for(j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swapped = true;
				}
			}
			if(swapped == false) break;
		}
		
	}
	
	public static void displaymatrix(int[] arr, int n) {
		for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,34,1,54,6,62,12};
		bubbleSort(arr, arr.length);
		displaymatrix(arr, arr.length);
	}

}

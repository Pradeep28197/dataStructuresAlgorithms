package rotationArray;

public class RotateArray {
	void rotate(int[] arr, int d, int n) {
		for (int i=0;i<d;i++) {
			leftRotateByOne(arr,n);
		}
		printArray(arr);
	}
	void leftRotateByOne(int[] arr, int n) {
		int temp = arr[0];
		for(int i = 0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}
	
	void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String args[]) {
		RotateArray r1 = new RotateArray();
		int[] arr1 = {1,2,3,4,5,6,7};
		r1.rotate(arr1, 2, 7);
		//r1.printArray(arr1);
	}

}

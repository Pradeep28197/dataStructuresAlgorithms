package rotationArray;

public class CyclicRotation {
	public static void cyclicRotate(int[] arr) {
		int t = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = t;
	}
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		cyclicRotate(arr);
		printArray(arr);
	}

}

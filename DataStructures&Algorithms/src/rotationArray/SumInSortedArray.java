package rotationArray;

public class SumInSortedArray {
	
	public static boolean sumInSorted(int[] arr, int l, int pair) {
		int i;
		for(i=0;i<l-1;i++) {
			//System.out.println(i);
			if(arr[i] > arr[i+1])
			break;
		}
		//System.out.println(i);
		int left = i;
		int right = (i+1)%l;
		
		while(left != right) {
			System.out.println(left+" "+right);
			if(arr[left] + arr[right] == pair) {
				return true;
			}
			if(arr[left] + arr[right] > pair) {
				left = (l+left - 1)%l;
			}
			else {
				//System.out.println(right);
				right = (right + 1)%l;
			}	
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {11,15,6,7,8,9};
		int len = arr.length;
		int pair = 16;
		System.out.println((sumInSorted(arr, len, pair)?"present":"absent"));
		
	}

}

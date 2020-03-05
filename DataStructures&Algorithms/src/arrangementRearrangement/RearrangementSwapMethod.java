package arrangementRearrangement;

import java.util.Arrays;

public class RearrangementSwapMethod {
	public static int[] swapMethod(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			if(arr[i] != -1 && arr[i] != i) {
				int ele = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = ele;
			}
			else {
				i++;
			}
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {-1,-1,6,5,2,8,-1,3,1};
		System.out.println(Arrays.toString(swapMethod(arr,arr.length)));
	}

}

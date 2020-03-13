package matrixRotation;
import java.util.*;

public class Rotate90degwithoutspace {
	public static void rotateMat(int[][] arr, int inp) {
		
		transposeMat(arr, arr.length);
		
		if(inp == 1)reverseColumns(arr, arr.length);
		
		else if(inp == 2) reverseRows(arr, arr.length);
		
		printMat(arr,arr.length);
	}
	public static void transposeMat(int[][] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int t = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = t;
			}
		}
		
	}
	
	public static void reverseRows(int[][] arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0,k = arr.length-1;j<k;j++,k--) {
				int t = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k] = t;
			}
		}
		
	}
	
	public static void reverseColumns(int[][] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0,k = arr.length-1;j<k;j++,k--) {
				int t = arr[j][i];
				arr[j][i] = arr[k][i];
				arr[k][i] = t;
			}
		}
		
	}
	
	public static void printMat(int[][]arr, int n) {
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which way do you wanna rotate?");
		System.out.println("Press 1 for clockwise, 2 for anticlockwise");
		int inp = sc.nextInt();
		int[][] arr = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		switch(inp) {
			case 1: rotateMat(arr, 1);break;
			case 2: rotateMat(arr, 2);break;
			default: System.out.println("Enter correct option");break;
		}
		sc.close();
		//System.out.println(arr);
		
	}

}

package matrixRotation;

public class InplaceRotate90 {
	public static void inplaceRotate(int[][] mat, int n) {
		for(int i=0;i<n/2;i++) {
			for(int j=i;j<n-1-i;j++) {
				int temp = mat[i][j];
				
				mat[i][j] = mat[j][n-1-i];
				
				mat[j][n-1-i] = mat[n-1-i][n-1-j];
				
				mat[n-1-i][n-1-j] = mat[n-1-j][i]; 
				
				mat[n-1-j][i] = temp;
			}
		}
		
		
	}
	
	public static void displayMatrix(int[][] mat, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		inplaceRotate(mat,3);
		displayMatrix(mat,3);
		}

}

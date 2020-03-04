package matrixRotation;

public class CyclicRotation2d {
	static int R = 5;
	static int C = 5;
	
	public static void rotateMatrix(int m, int n,int[][] mat) {
		int prev,curr;
		int row = 0;
		int col = 0;
		
		while(col != n && row != m) {
			if(col+1 == n || row+1 == m)break;
			prev = mat[row+1][col];
		for(int i = col;i<n;i++) {
			curr = mat[row][i];
			mat[row][i] = prev;
			prev = curr;
			//System.out.println(prev);
		}row++;
		for(int i = row;i<m;i++) {
			curr = mat[i][n-1];
			mat[i][n-1] = prev;
			prev = curr;
			System.out.println(prev);
		}n--;
		for(int i = n-1;i>=col;i--) {
			
			curr = mat[m-1][i];
			mat[m-1][i] = prev;
			prev = curr;
		}m--;
		for(int i = m-1;i>=row;i--) {
			
			curr = mat[i][col];
			mat[i][col] = prev;
			prev = curr;
		}col++;
		}
	}
	
	public static void printMatrix(int[][] mat) {
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		int[][] mat = {{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20},
					{21,22,23,24,25}};
		rotateMatrix(R, C, mat);
		printMatrix(mat);
		}
}

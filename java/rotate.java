package 算法;

public class rotate {
	public void rotate_fz(int [][]matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=i;j<matrix[i].length;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	public void rotate_row(int [][]matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length/2;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[i].length-j-1];
				matrix[i][matrix[i].length-j-1] = temp;
			}
		}
	}
	public void rotate(int[][] matrix) {
		rotate_fz(matrix); //对角翻转矩阵
		rotate_row(matrix); //每一行翻转矩阵
    }
}

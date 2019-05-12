package 算法;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
	public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0||matrix==null) return new ArrayList<Integer>();
		int n = matrix.length;
        int m = matrix[0].length;
		int temp [][] = new int[n][m];
		int x=0,y=0,w=n*m;
		int flag = 1;
		List<Integer> list = new ArrayList<Integer>();
		while(w>0) {
			list.add(matrix[x][y]);
			temp[x][y]=1;
			if(flag==1) {
				if(y+1<m && temp[x][y+1]!=1) {
					y++;
				}else {
					x++;
					flag=2;
				}
			}else if(flag==2) {
				if(x+1<n && temp[x+1][y]!=1) {
					x++;
				}else {
					flag=3;
				}
			}else if(flag==3) {
				if(y-1>=0 && temp[x][y-1]!=1) {
					y--;
				}else {
					flag=4;
				}
			}else if(flag==4) {
				if(x-1>=0 && temp[x-1][y]!=1) {
					x--;
				}else {
					flag=1;
				}
			}
			w--;
		}
		return list;
    }
}

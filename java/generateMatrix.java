package 算法;

public class generateMatrix {
	public int[][] generateMatrix(int n) {
        int step = 1;
        int flag = 1;
        int x=0,y=0;
        int map[][] = new int[n][n];
        int vis[][] = new int[n][n];
        while(step<=n*n) {
        	map[x][y] = step;
        	step++;
        	vis[x][y]=1;
        	if(flag==1) {
        		if(y+1<n&&vis[x][y+1]!=1) {
        			y++;
        		}else {
        			x++;
        			flag=2;
        		}
        	}else if(flag==2) {
        		if(x+1<n&&vis[x+1][y]!=1) {
        			x++;
        		}else {
        			y--;
        			flag=3;
        		}
        	}else if(flag==3) {
        		if(y-1>=0&&vis[x][y-1]!=1) {
        			y--;
        		}else {
        			x--;
        			flag=4;
        		}
        	}else if(flag==4) {
        		if(x-1>=0&&vis[x-1][y]!=1) {
        			x--;
        		}else {
        			y++;
        			flag=1;
        		}
        	}
        }
        return map;
    }
}

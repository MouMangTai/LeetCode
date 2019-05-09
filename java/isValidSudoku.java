package 算法;

import java.util.HashMap;
import java.util.Map;

public class isValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		HashMap<Integer,Integer> [] rows = new HashMap[9];
		HashMap<Integer,Integer> [] cols = new HashMap[9];
		HashMap<Integer,Integer> [] boxs = new HashMap[9];
		for(int i=0;i<board.length;i++) {
			rows[i] = new HashMap<Integer,Integer>();
	        cols[i] = new HashMap<Integer,Integer>();
	        boxs[i] = new HashMap<Integer,Integer>();
		}
        
        for(int i=0;i<board.length;i++) {
        	for(int j=0;j<board[i].length;j++) {
        		if(board[i][j]=='.') continue;
        		int key = Integer.parseInt(String.valueOf(board[i][j]));
        		if(rows[i].containsKey(key)) return false;
        		else rows[i].put(key, 1);
        		if(cols[j].containsKey(key)) return false;
        		else cols[j].put(key, 1);
        		if(boxs[i/3*3+j/3].containsKey(key)) return false;
        		else boxs[i/3*3+j/3].put(key, 1);
        	}
        }
        return true;
    }
}

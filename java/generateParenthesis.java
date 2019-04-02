package 算法;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
	public List<String> generateParenthesis(int n) {
		List<String> L = new ArrayList<String>();
		generate(L,"",0,0,n);
		return L;
    }
	public void generate(List<String> L,String s,int left,int right,int n) {
		if(s.length()==n*2) {
			L.add(s);
			return ;
		}
		if(left<n) {
			generate(L,s+"(",left+1,right,n);
		}
		if(right<left) {
			generate(L,s+")",left,right+1,n);
		}
	}
}

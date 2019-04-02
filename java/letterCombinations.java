package 算法;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
	
	public List<String> letterCombinations(String digits) {
        int n = digits.length();
        
        List<String> L = new ArrayList<String>();
        if(n==0) return L;
        Combinations(L,"",0,digits);
        return L;
    }
	public void Combinations(List<String> L,String s,int i,String digits) {
		if(s.length()==digits.length()) {
			L.add(s);
			return ;
		}
		if(digits.charAt(i)=='2') {
			Combinations(L,s+"a",i+1,digits);
			Combinations(L,s+"b",i+1,digits);
			Combinations(L,s+"c",i+1,digits);
		}
		if(digits.charAt(i)=='3') {
			Combinations(L,s+"d",i+1,digits);
			Combinations(L,s+"e",i+1,digits);
			Combinations(L,s+"f",i+1,digits);
		}
		if(digits.charAt(i)=='4') {
			Combinations(L,s+"g",i+1,digits);
			Combinations(L,s+"h",i+1,digits);
			Combinations(L,s+"i",i+1,digits);
		}
		if(digits.charAt(i)=='5') {
			Combinations(L,s+"j",i+1,digits);
			Combinations(L,s+"k",i+1,digits);
			Combinations(L,s+"l",i+1,digits);
		}
		if(digits.charAt(i)=='6') {
			Combinations(L,s+"m",i+1,digits);
			Combinations(L,s+"n",i+1,digits);
			Combinations(L,s+"o",i+1,digits);
		}
		if(digits.charAt(i)=='7') {
			Combinations(L,s+"p",i+1,digits);
			Combinations(L,s+"q",i+1,digits);
			Combinations(L,s+"r",i+1,digits);
			Combinations(L,s+"s",i+1,digits);
		}
		if(digits.charAt(i)=='8') {
			Combinations(L,s+"t",i+1,digits);
			Combinations(L,s+"u",i+1,digits);
			Combinations(L,s+"v",i+1,digits);
		}
		if(digits.charAt(i)=='9') {
			Combinations(L,s+"w",i+1,digits);
			Combinations(L,s+"x",i+1,digits);
			Combinations(L,s+"y",i+1,digits);
			Combinations(L,s+"z",i+1,digits);
		}
		
	}
}

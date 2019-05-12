package 算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0||strs==null) return new ArrayList();
        HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
        for(String str:strs) {
        	char [] cs = str.toCharArray();
        	Arrays.sort(cs);
        	String s = cs.toString();
        	if(!hm.containsKey(s)) {
        		hm.put(s, new ArrayList<String>());
        	}
        	hm.get(s).add(str);
        }
        
        return new ArrayList(hm.values());
    }
}

package 算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {
	public static void combination(int[] candidates,List<Integer> L,List<List<Integer>> list,int w,int target) {
		if(target<0) return;
		if(target==0) {
			list.add(new ArrayList<>(L));
			return;
		}
		for(int i=w;i<candidates.length;i++) {
			L.add(candidates[i]);
			combination(candidates,L,list,w,target-candidates[i]);
			L.remove(L.size()-1);
		}
	}
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
  
        combination(candidates,new ArrayList<Integer>(),list,0,target);
        return list;
    }
}

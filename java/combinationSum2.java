package 算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
	public static void find(int[] candidates,int target,List<Integer> L,List<List<Integer>> list,int w) {
		if(target<0) return;
		if(target==0) {
			if(!list.contains(L)) {
				list.add(new ArrayList<>(L));
			}
			return ;
		}
		for(int i=w;i<candidates.length-1;i++) {
			if(target<0) break;
			L.add(candidates[i]);
			find(candidates,target-candidates[i],L,list,i+1);
			L.remove(L.size()-1);
		}
	}
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		find(candidates,target,new ArrayList<Integer>(),list,0);
		return list;
    }
}

package 算法;

import java.util.ArrayList;
import java.util.List;

public class permute {
	public static void find(int []nums,List<List<Integer>> list,List<Integer> L,int num) {
		if(L.size()==nums.length) {
			if(!list.contains(L)) {
				list.add(new ArrayList<>(L));
			}
			return;
		}
		for(int i=0;i<nums.length;i++) {
			L.add(nums[i]);
			find(nums,list,L,i+1);
			L.remove(L.size()-1);
		}
	}
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        find(nums,list,new ArrayList<>(),0);
        return list;
    }
}

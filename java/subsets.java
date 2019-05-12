package 算法;

import java.util.List;

public class subsets {
	public static void find(int []nums,int k,List<List<Integer>> list,List<Integer> L) {
		if(k>nums.length) return;
		List<Integer> p = new ArrayList<>(L);
		list.add(p);
		for(int i=k;i<nums.length;i++) {
			p.add(nums[i]);
			find(nums,i+1,list,p);
			p.remove(p.size()-1);
		}
	}
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        find(nums,0,list,new ArrayList<Integer>());
		return list;
    }
}

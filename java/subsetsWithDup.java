package 算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup {
	public static void find(int []nums,int k,List<List<Integer>> list,List<Integer> L,boolean []used) {
		if(k>nums.length) return;
		List<Integer> p = new ArrayList<>(L);
		
		list.add(p);
		
		for(int i=k;i<nums.length;i++) {
			if(i!=0&&nums[i]==nums[i-1]&&!used[i-1]) continue;
			p.add(nums[i]);
			used[i] = true;
			find(nums,i+1,list,p,used);
			used[i] = false;
			p.remove(p.size()-1);
		}
	}
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        find(nums,0,list,new ArrayList<Integer>(),new boolean[nums.length]);
        return list;
    }
}

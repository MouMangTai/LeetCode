package 算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> L = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++) {
        	if(i>=1&&nums[i]==nums[i-1]) {
        		continue;
        	}
        	int left = i+1;
        	int right = nums.length-1;
        	while(left<right) {
        		int w = nums[i]+nums[left]+nums[right];
        		if(w==0) {
        			List<Integer> l = new ArrayList<Integer>();
        			l.add(nums[i]);
        			l.add(nums[left]);
        			l.add(nums[right]);
        			L.add(l);
        			while(left+1<right&&nums[left]==nums[left+1]) {
            			left++;
            		}
            		while(right-1>left&&nums[right]==nums[right-1]) {
            			right--;
            		}
            		left++;
            		right--;
        		}else if(w>0) {
        			right--;
        		}else {
        			left++;
        		}
        		
        	}
        }
		return L;
    }
}

package 算法;

import java.util.Arrays;

public class threeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
        if(nums.length<=3) {
        	int w = 0;
        	for(int num:nums) {
        		w+=num;
        	}
        	return w;
        }
        int min = nums[0]+nums[1]+nums[2];
		Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
        	if(i>=1&&nums[i]==nums[i-1]) continue;
        	int left = i+1;
        	int right = nums.length-1;
        	while(left<right) {
        		int w = nums[i]+nums[left]+nums[right];
        		if(Math.abs(w-target)<Math.abs(target-min)) {
        			min = w;
        		}
        		if(w==target) return w;
        		else if(w<target) {
        			left++;
        		}else {
        			right--;
        		}
        		
        	}
        }
        return min;
    }
}

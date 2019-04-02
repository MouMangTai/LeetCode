package 算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> L = new ArrayList<List<Integer>>();
		for(int i=0;i<nums.length-3;i++) {
        	if(i>=1&&nums[i]==nums[i-1]) {
        		continue;
        	}
        	for(int j=i+1;j<nums.length-2;j++) {
        		if(j>=i+2&&nums[j]==nums[j-1]) {
        			continue;
        		}
        		int left = j+1;
        		int right = nums.length-1;
        		while(left<right) {
        			int w = nums[i]+nums[j]+nums[left]+nums[right];
        			if(w==target) {
        				List<Integer> l = new ArrayList<Integer>();
        				l.add(nums[i]);
        				l.add(nums[j]);
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
        			}else if(w<target) {
        				left++;
        			}else {
        				right--;
        			}
        		}
        	}
        }
		return L;
    }
}

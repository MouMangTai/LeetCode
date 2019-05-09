package 算法;

public class searchRange {
	public int[] searchRange(int[] nums, int target) {
        int res[] = {-1, -1};
		int left = 0;
        int right = nums.length-1;
        while(left<=right) {
        	int mid = left + (right - left)/2;
        	if(nums[mid]==target) {
        		left = mid;
        		right = mid;
        		while(left>0&&nums[left-1]==nums[left])left--;
        		while(right<nums.length-1&&nums[right+1]==nums[right])right++;
        		res[0] = left;
        		res[1] = right;
        		return res;
        	}else if(nums[mid]<target) {
        		left = mid+1;
        	}else {
        		right = mid-1;
        	}
        }
        return res;
    }
}

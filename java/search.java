package 算法;

public class search {
	public int search(int[] nums, int target) {
		if(nums.length==0||nums==null) return -1;
        int left = 0;
        int right = nums.length-1;
        while(left<right) {
        	int mid = left + (right - left) / 2;
        	if(nums[mid] > nums[right]) {
        		left = mid+1;
        	}else {
        		right = mid;
        	}
        }
        int split = left;
        left = 0;
        right = nums.length-1;
        if(target>=nums[split]&&target<=nums[nums.length-1]) {
        	left = split;
        }else {
        	right = split-1;
        }
        while(left<=right) {
        	int mid = left + (right - left) / 2;
        	if(nums[mid]==target) {
        		return mid;
        	}else if(nums[mid]<target) {
        		left = mid+1;
        	}else {
        		right = mid-1;
        	}
        }
        return -1;
    }
}

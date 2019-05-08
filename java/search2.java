package 算法;

public class search2 {
	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		while(left<right) {
			int mid = left + (right-left)/2;
			if(nums[mid]==target) return mid;
			else if(nums[left]<=nums[mid]) {
				if(target>=nums[left]&&target<=nums[mid]) right = mid;
				else left = mid+1;
			}else if(nums[mid]<nums[right]) {
				if(target>=nums[mid]&&target<=nums[right]) left = mid+1;
				else right = mid;
			}
		}
		return -1;
	}
}

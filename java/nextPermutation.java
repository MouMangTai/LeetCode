package 算法;

import java.util.Arrays;

public class nextPermutation {

	public void nextPermutation(int[] nums) {
        int flag = 0;
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i]>nums[i-1]){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
                flag = 1;
                break;
            }
        }
        if(flag==0){
            Arrays.sort(nums);
        }
    }

}

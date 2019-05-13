package 算法;

public class canJump {
	public boolean canJump(int[] nums) {
        int i=0;
        while(i<nums.length-1) {
        	if(nums[i]==0) {
        		int w=1;
        		int flag = 0;
        		while(i-w>=0) {
        			if(nums[i-w]>w) {
        				flag=1;
        				break;
        			}
                    w++;
        		}
        		if(flag==0) {
        			return false;
        		}
                i++;
        	}else{
                i+=nums[i];
            }
        	
        }
        return true;
    }
}

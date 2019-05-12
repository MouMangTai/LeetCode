package 算法;

public class permuteUnique {
	public static void swap(int []nums,int p,int q) {
		int temp = nums[p];
		nums[p] = nums[q];
		nums[q] = temp;
	}
	public static void add(int []nums,List<List<Integer>> list) {
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			l.add(nums[i]);
		}
		if(!list.contains(l))
			list.add(l);
	}
	public static void find(int []nums,int k,int m,List<List<Integer>> list) {
		if(k==m) {
			add(nums,list);
		}else {
			for(int i=k;i<m;i++) {
				if(i==k || (nums[i]!=nums[k])) {
					swap(nums,i,k);
					find(nums,k+1,m,list);
					swap(nums,i,k);
				}
			}
		}
	}
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (nums == null || nums.length == 0) return list;
		find(nums,0,nums.length,list);
		return list;
    }
}

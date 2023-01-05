class Solution {
	public int findUnsortedSubarray(int[] nums) {
		int left =nums.length - 1,right =  0, max = nums[0], min = nums[nums.length - 1];

		for(int i =0; i < nums.length ;++i){

			max = Math.max(max, nums[i]);
			if(nums[i] < max ) right = i;
		}

		for(int i = nums.length -1 ; i>=0 ; --i){

			min = Math.min(min, nums[i]);
			if(nums[i] > min) left = i;
		}
		if(left == nums.length -1 ) return 0;
		return right-left+1;
	}
}
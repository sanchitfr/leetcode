class Solution {
    
    private int maxSubArray(int[] nums, int s, int e){
        if(s == e) return nums[s];
        
        int mid = 
        
        int leftMax = maxSubArray(nums)
    }
        
    public int maxSubArray(int[] nums) {
        
//         int sum = 0, sumFinal = Integer.MIN_VALUE;
        
//         for(int i : nums){
//             sum = Math.max(i, sum+i);
            
//             sumFinal = Math.max(sum, sumFinal);
//         }
//         return sumFinal;
//         
        //divide and conquer
        return maxSubArray(nums, 0, nums.length - 1);
    }
}

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2;i++){
            int j = i+1, k = nums.length-1;
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum == target) return sum;
                
                if(Math.abs(sum - target) < min){
                    min = Math.abs(sum-target);
                    ans = sum;
                }
                
                if(sum > target){
                    k--;
                }
                else if(sum < target) j++;
                }    
            }
        }
        return ans;
    }
}

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int m = nums.length;
        int count = 0;
        for(int i = 0; i <m-1; i++){
           for(int j = i+1; j < m; j++){
               if(nums[i] == nums[j]) ++count;
            } 
        }
        return count;
    }
}
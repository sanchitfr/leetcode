class Solution {
    public int[] buildArray(int[] nums) {
        int m = nums.length;
        int []ans = new int[m];
        for(int i = 0; i<m; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
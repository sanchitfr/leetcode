class Solution {
    public int[] getConcatenation(int[] nums) {
        int m = nums.length;

        int []ans = new int[2*m];

        for(int i = 0; i < m; i++){
            ans[i] = nums[i];
        }

        for(int i = m; i<2*m; i++){
            ans[i] = nums[i-m];
        }
        return ans;
    }
}
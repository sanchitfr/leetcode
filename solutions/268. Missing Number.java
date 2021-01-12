class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int missingSum = 0;
        for(int i : nums){
            missingSum += i;
        }
        return sum -missingSum;
    }
}

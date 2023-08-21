class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;

        for(int i = 0; i<nums.length; i++){
            int count = 0, num = nums[i];

            while(num%10 != num){
                num = num/10;
                count++;
            }
            if((count+1)%2 == 0 ) ++ans;
        }
        return ans;
    }
}
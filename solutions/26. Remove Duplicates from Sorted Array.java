class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            if(i+1 < nums.length && nums[i] == nums[i+1]){
                while(i+1 < nums.length && nums[i] == nums[i+1]){
                    i++;
                }
            }
            nums[index] = nums[i];
            index++;
        }
        return index;
    }
}

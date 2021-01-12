import java.util.HashMap;
class Solution {
    
//     private void moveZeroes(int[]nums, int si){
//         if(si == nums.length - 1){
//             return;
//         }
        
//         moveZeroes(nums, si+1);
        
//         if(nums[si] == 0){
//             int count = si;
//             while(count != nums.length - 1 && nums[count+1] != 0){
//                 nums[count] = nums[count+1];
//                 nums[count+1] = 0;
//                 count++;
//             }
//         }
//     }
    
    public void moveZeroes(int[] nums) {
        int index = 0;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        
        while(index != nums.length){
            nums[index] = 0;
            index++;
        }
            
    }
}

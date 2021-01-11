import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int count = nums.length/2;
        
        //first approach
        // for(int i : nums){
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        //     if(map.get(i) > count){
        //         return i;
        //     }
        // }
        // return 0;
        
        //2nd approach
        // Arrays.sort(nums);
        // if(nums.length == 1){
        //     return nums[0];
        // }
        // for(int i = 0; i<nums.length; i++){
        //     int counter = 1;
        //     if(nums[i] ==  nums[i+1]){
        //         while(i+1 <nums.length && nums[i] == nums[i+1] ){
        //             counter++;
        //             i++;
        //         }
        //     }
        //     if(counter > count){
        //         return nums[i];
        //     }
        // }
        // return 0;
        
        //moore's voting algorithm
        
        int maj_index = 0, count=1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[maj_index] == nums[i]) count++;
            else count--;
            
            if(count == 0){
                maj_index = i;
                count = 1;
            }
        }
        return nums[maj_index];
    }
}

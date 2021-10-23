import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();        
        if(nums.length == 0){
            return new ArrayList<>(ans);
        } 
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            
            while(j < k){
                int sum = nums[j]+nums[k];
                if(sum == -nums[i]){
                    ans.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }
                else if(sum > -nums[i]) k--;
                else if(sum < -nums[i]) j++;
            }
        }
        return new ArrayList<>(ans);
    }
}

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int m = nums.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i <m-1; i++){
        //    for(int j = i+1; j < m; j++){
        //        if(nums[i] == nums[j]) ++count;
        //     } 
        // }

        for(int i = 0; i<m; i++){
            int occ = map.getOrDefault(nums[i], 0);
            count += occ;
            map.put(nums[i], occ+1);
        }
        return count;
    }
}
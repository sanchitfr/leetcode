class Solution {
    public int majorityElement(int[] nums) {
        int m = nums.length, maxOccurances = 0, maxOccNum = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        m = m/2;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > m){
                return entry.getKey(); 
            }
        };
        return 0;
    }
}
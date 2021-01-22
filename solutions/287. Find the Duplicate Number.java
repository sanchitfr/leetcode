class Solution {
    public int findDuplicate(int[] nums) {        
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int i: nums){
//             if(map.containsKey(i)) return i;
//             map.put(i, 1);
//         }
//         return -1;
        
        //tortoise-hare algorithm
        
        int tortoise = nums[0];
        int hare = nums[0];
        
        //find intersection point
        do{
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }while(tortoise != hare);
            
        //find the start of cycle
        tortoise =  nums[0];
        while(tortoise != hare){
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return hare;
    }
}

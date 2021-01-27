class Solution {
    public void sortColors(int[] nums) {
        //int index = 0;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         map.put(0,0);
//         map.put(1,0);
//         map.put(2,0);
//         for(int i: nums){
//             map.put(i, map.get(i)+1);
//         }
        
//         for(int i = 0; i<nums.length; i++){
//             if(map.get(0) != 0){
//                 nums[i] = 0;
//                 map.put(0, map.get(0)-1);
//             }
//             else if(map.get(1) != 0){
//                 nums[i] = 1;
//                 map.put(1, map.get(1)-1);
//             }
//             else{
//                 nums[i] = 2;
//                 map.put(2, map.get(2)-1);
//             }
//         }
        
      //Arrays.sort(nums); 
        
        int low = 0, high = nums.length-1;
        
        for(int i = low; i<=high;){
            if(nums[i] == 0){
                nums[i] = nums[low];
                nums[low] = 0;
                i++;
                low++;
            }
            else if(nums[i] == 2){
                nums[i] = nums[high];
                nums[high] = 2;
                high--;
            }
            else i++;
        }
        
    }
}

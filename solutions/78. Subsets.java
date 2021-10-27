class Solution {
    
    private static List<List<Integer>> helper(int[] nums, int index){
        if(index >= nums.length){
            List<List<Integer>> op = new ArrayList<>();
            op.add(new ArrayList<Integer>());
            return op;
        }
        
        List<List<Integer>> smallAns = helper(nums, index+1);
        int length = smallAns.size();
        for(int i = 0; i<length; i++){
            List<Integer> elem = new ArrayList<>(smallAns.get(i));
            elem.add(nums[index]);
            smallAns.add(elem);
        }   
        return smallAns;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        return helper(nums, 0);
    }
}

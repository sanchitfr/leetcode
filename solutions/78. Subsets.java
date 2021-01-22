class Solution {
    
    private void subsets(int[] nums, List<List<Integer>> ans, List<Integer> list, int si){
        if(si >= nums.length){
            ans.add(list);
            return;
        }
        List<Integer> op1 = new ArrayList<>(list);
        op1.add(nums[si]);
        subsets(nums, ans, op1, si+1);        
        subsets(nums, ans, list, si+1);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subsets(nums, ans, list, 0);
        return ans;
   

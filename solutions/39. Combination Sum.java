class Solution {
    
    ArrayList<Integer> outputSoFar = new ArrayList<>();
    
    private List<List<Integer>> helper(int[] candidates, int target, int currCandidate){
        // System.out.println(outputSoFar + " " + target);
        List<List<Integer>> op = new ArrayList<>();
        if(target < 0){
            outputSoFar.remove(outputSoFar.size() - 1);
            return op;
        }
        if(target == 0){
            ArrayList<Integer> ans = new ArrayList<>(outputSoFar);
            op.add(ans);            
            outputSoFar.remove(outputSoFar.size() - 1);
            // System.out.println("here " + op.get(0));
            return op;
        } 
        for(int i = currCandidate; i<candidates.length; i++){
            outputSoFar.add(candidates[i]);
            List<List<Integer>> smallAns = helper(candidates, target-candidates[i], i);
            
            for(List<Integer> elem : smallAns){
                op.add(elem);
            }
        }
        if(outputSoFar.size() != 0){
            outputSoFar.remove(outputSoFar.size() - 1);        
        }
        return op;
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return helper(candidates, target, 0);
    }
}

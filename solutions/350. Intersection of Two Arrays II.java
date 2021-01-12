import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums1){
           map.put(i, map.getOrDefault(i, 0)+1); 
        }
        
        for(int i : nums2){
            if(map.containsKey(i) && map.get(i) != 0){
                result.add(i);
                map.replace(i, map.get(i) - 1);
            }
        }
        
        int[] ans = new int[result.size()];
        
        for(int i = 0; i<result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}

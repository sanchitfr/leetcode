import java.util.HashMap;
class Solution {
    
    // private static boolean isHappy(int n, HashMap<Integer, Boolean> map){
    //     if(n == 0) return false;
    //     int sum = 0;
    //     while(n != 0){
    //         sum += Math.pow(n%10, 2);
    //         n = n/10;
    //     }
    //     if(sum == 1) return true;
    //     if(map.containsKey(sum)) return false;
    //     else{
    //         map.put(sum, true);
    //         return isHappy(sum, map);  
    //     } 
    // }
    
    public boolean isHappy(int n) {
//         HashMap<Integer, Boolean> map = new HashMap<>();
        
//         return isHappy(n, map);
        
        for(int i = 0; i <=13; i++){
            int sum = 0;
            
            while(n != 0){
                sum += Math.pow(n%10, 2);
                n = n/10;
            }
            n = sum;
        }
        
        if(n == 1) return true;
        
        return false;
    }
}

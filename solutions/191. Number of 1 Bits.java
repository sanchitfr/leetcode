public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // String binary = Integer.toBinaryString(n);
        // int res = 0;
        // for(int i =0; i<binary.length(); i++){
        //     if(binary.charAt(i) == '1'){
        //         res++;
        //     }
        // }
        // return res;
        
        int res = 0;
        
        while(n != 0){
            res += (n&1);
            
            n = n>>>1;
        }
        return res;
    }
}

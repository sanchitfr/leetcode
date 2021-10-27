class Solution {
    
//     private static int helper(String s, int index, int[] storage){
//         if(index == s.length()) return 1;
//         if(s.charAt(index) == '0') return 0;
//         if(index == s.length()-1) return 1;
//         if(storage[index] != 0) return storage[index];
        
//         int op1 = 0, op2 = 0;
        
//         op1 = helper(s, index+1, storage);        
    
//         if(index+1 < s.length()){
//             int num = Integer.parseInt(s.substring(index, index+2));
//          if(num <= 26) {
//              op2 = helper(s, index+2, storage);              
//          }
//         }
//         return storage[index] = op1+op2;
//     }
    
    public int numDecodings(String s) {
//         int[] storage = new int[s.length()+1];
        
//         return helper(s, 0, storage);
        
        int[] storage = new int[s.length()+1];
        
        if(s.charAt(0) != '0') storage[0] = 1;
        
        for(int i = 1; i<s.length(); i++){
            char a = s.charAt(i), b = s.charAt(i-1);
            
            if(a == '0' && b == '0') storage[i] = 0;
            else if(a=='0'&&b!='0'){
                if(b=='1' || b =='2'){
                   storage[i] = i>=2 ? storage[i-2] : 1;                
                }
            }
            else if(a!='0'&&b=='0'){
                storage[i] = storage[i-1];
            }
            else{
                int num = Integer.parseInt(s.substring(i-1, i+1));
                if(num <= 26){

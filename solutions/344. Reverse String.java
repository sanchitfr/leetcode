class Solution {
    public void reverseString(char[] s) {
//         StringBuilder str = new StringBuilder();
        
//         for(char i : s){
//             str.append(i);
//         }
        
//         str = str.reverse();
        
//         for(int i = 0; i<str.length(); i++){
//             s[i] = str.charAt(i);
//         }
        
        int begin = 0, last = s.length-1;
        
        while(begin <= last){
            char temp = s[begin];
            s[begin] = s[last];
            s[last] = temp;
            
            begin++;
            last--;
        }
        
    }
}

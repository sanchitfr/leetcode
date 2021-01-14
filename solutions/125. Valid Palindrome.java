class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = new char[256];
        for(int i = 0;i<10; i++){
            chars['0'+i] = (char)(1+i);
        }
        
        for(int i = 0; i<26;i++){
            chars['a'+i] = chars['A' + i] = (char)(11+i);
        }
        
        
        for(int start = 0, end = s.length()-1; start < end;){
            if(chars[s.charAt(start)] == 0) start++;
            else if(chars[s.charAt(end)] == 0) end--;
            else if(chars[s.charAt(start++)] != chars[s.charAt(end--)]) return false;
        }
        return true;
    }
}

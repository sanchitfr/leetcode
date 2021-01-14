class Solution {
    
    private boolean matches(int si, String haystack, String needle){
        for(int i = 0; i<needle.length(); i++){
            if(haystack.charAt(i+si) != needle.charAt(i)) return false;
        }
        return true;
    }
    
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length(), hayLength = haystack.length();
        
        if(needleLength == 0) return 0;
        
        for(int i = 0; i<=hayLength - needleLength; i++){
            if(matches(i, haystack, needle)){
                return i;
            }
        }
        return -1;
    }
}

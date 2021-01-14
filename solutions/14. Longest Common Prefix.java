class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder str = new StringBuilder();
        
        int minLength = Integer.MAX_VALUE;
        
        //calculate string with minimum length;
        for(int i = 0; i<strs.length; i++){
            if(strs[i].length() < minLength) minLength = strs[i].length();
        }
        
        //iterate over each characer and check with other strings
        for(int i = 0;i<minLength; i++){
            char c = strs[0].charAt(i);
            for(int j = 1; j<strs.length; j++){
                if(strs[j].charAt(i) != c) return str.toString();
            }
            str.append(c);
        }
        return str.toString();
    }
}

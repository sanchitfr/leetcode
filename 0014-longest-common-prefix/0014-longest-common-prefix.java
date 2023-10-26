class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        
        Arrays.sort(strs);

        String firstString = strs[0];
        String lastString = strs[strs.length -1];

        for(int i = 0; i<Math.min(firstString.length(), lastString.length()); i++){
            if(firstString.charAt(i) != lastString.charAt(i)) return commonPrefix;
            else commonPrefix += firstString.charAt(i);
        }
        return commonPrefix;
    }
}
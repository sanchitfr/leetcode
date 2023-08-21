class Solution {
    public boolean checkIfPangram(String sentence) {
        int m = sentence.length();
        if(m < 26) return false;

        boolean[] ans = new boolean[26];
        for(int i = 0; i < m; i++){
            char a = sentence.charAt(i);
            int index = a - 97;
            ans[index] = true;
        }

        for(int i = 0; i<26; i++){
            if(!ans[i]) return false;
        }
        return true;
    }
}
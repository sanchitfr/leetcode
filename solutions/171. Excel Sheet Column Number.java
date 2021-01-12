class Solution {
    public int titleToNumber(String s) {
        int ans = 0, power=0;
        
        if(s.length() == 1){
            return (s.charAt(0) - 'A' +1);
        }
        
        for(int i = s.length() - 1; i>=0; i--){
            char c = s.charAt(i);
            ans += (c - 'A' + 1) * (int)Math.pow(26, power);
            // System.out.println(ans);
            power++;
        }
        return ans;
    }
}

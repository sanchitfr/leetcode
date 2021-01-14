class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        double ans = Math.log10(n)/Math.log10(3);
        
        if(Math.floor(ans) == ans) return true;
        return false;
        
    }
}

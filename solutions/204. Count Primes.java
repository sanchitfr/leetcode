class Solution {
    
    public int countPrimes(int n) {
        int result = 0;
        boolean[] notPrime = new boolean[n];
        for(int i = 2; i<n; i++){
            if(!notPrime[i]){
                result++;
                for(int j = 2; i*j < n; j++){
                    notPrime[i*j] = true;
                }
            }
        }
        return result;
    }
}

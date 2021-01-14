import java.math.BigInteger;
class Solution {
    
    public int trailingZeroes(int n) {
        //counting the no. of 5 factors in the nu,ber, because the trailing zerores are a result of 2*5 factors, 2 factors are always more than 5 factors, hence we count no, of 5 factors
        return n == 0 ? 0 : n/5 + trailingZeroes(n/5);
        
    }
}
